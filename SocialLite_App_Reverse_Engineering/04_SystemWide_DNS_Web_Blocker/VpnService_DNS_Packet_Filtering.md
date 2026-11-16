# VpnService व DNS पॅकेट फिल्टरिंग सखोल विश्लेषण (VpnService DNS Implementation)

## १. लोकल VPN इंटरफेस तयार करणे (`onStartCommand`)

```java
VpnService.Builder builder = new VpnService.Builder();
builder.setSession("SocialLite Web Blocker")
       .addAddress("10.111.222.1", 32) // व्हर्च्युअल लोकल आयपी
       .addDnsServer("10.111.222.1")    // सर्व DNS क्वेरीज स्वतःकडे वळवणे
       .addRoute("10.111.222.1", 32)
       .setBlocking(true);

ParcelFileDescriptor vpnInterface = builder.establish();
```

---

## २. UDP पोर्ट 53 व डोमेन पार्सिंग लॉजिक (`d` पद्धत)

VPN टनेलवरून येणाऱ्या कच्च्या (Raw) IP पॅकेट्समधून डोमेन नाव कसे काढले जाते:

```java
public final void d(ByteBuffer byteBuffer, int length, FileOutputStream out) {
    if (length < 28) return;
    byte[] packet = byteBuffer.array();
    
    // १. IPv4 तपासणी (Version 4 & IHL >= 5)
    byte versionAndIhl = packet[0];
    int ipHeaderLen = (versionAndIhl & 0x0F) * 4;
    
    // २. प्रोटोकॉल 17 (UDP) आहे का?
    if ((packet[9] & 0xFF) == 17) {
        int udpHeaderStart = ipHeaderLen;
        
        // ३. डेस्टिनेशन पोर्ट 53 (DNS) आहे का?
        int destPort = ((packet[udpHeaderStart + 2] & 0xFF) << 8) | (packet[udpHeaderStart + 3] & 0xFF);
        if (destPort == 53) {
            
            // ४. DNS प्रश्न (Question Section) मधील डोमेन नाव वाचणे:
            int dnsPayloadStart = udpHeaderStart + 8;
            int offset = dnsPayloadStart + 12; // DNS हेडर 12 बाईट्सचे असते
            StringBuilder domain = new StringBuilder();
            
            while (offset < length) {
                int labelLength = packet[offset] & 0xFF;
                if (labelLength == 0) break; // डोमेन संपले
                
                if (domain.length() > 0) domain.append('.');
                for (int i = 0; i < labelLength; i++) {
                    domain.append((char) (packet[offset + 1 + i] & 0xFF));
                }
                offset += labelLength + 1;
            }
            
            String domainName = domain.toString().toLowerCase(Locale.ROOT);
            
            // ५. डोमेन ब्लॉक यादीत आहे का तपासणे:
            if (nc.c(domainName, this.blockedDomainSet)) {
                // कृत्रिम NXDOMAIN रिस्पॉन्स बनवून परत पाठवणे:
                byte[] nxDomainPacket = createNxDomainResponse(packet, length, ipHeaderLen, udpHeaderStart);
                out.write(nxDomainPacket);
            } else {
                // सुरक्षित डोमेन असेल तर अपस्ट्रीम DNS ला पाठवणे:
                forwardToUpstreamDns(packet, length, out);
            }
        }
    }
}
```

---

## ३. कृत्रिम NXDOMAIN रिस्पॉन्स तयार करण्याचे गणित (`a` पद्धत)

जेव्हा एखादे डोमेन ब्लॉक असते, तेव्हा SocialLite मेमरीमध्ये थेट DNS रिस्पॉन्स पॅकेट तयार करते:
1. **Source आणि Destination IP बदलले जातात** (IP उलट करणे).
2. **Source आणि Destination UDP पोर्ट्स बदलले जातात**.
3. **DNS Flags सेट केले जातात**: `bArrCopyOf[i12 + 3] = -125` (0x83 - NXDOMAIN म्हणजे असा कोणताही सर्व्हर अस्तित्वात नाही!).
4. **IP Checksum आणि UDP Checksum पुन्हा मोजले जातात** (`b` पद्धतीद्वारे).
5. हे पॅकेट थेट TUN इंटरफेसमध्ये परत लिहिले जाते.

यामुळे ब्राऊझरला एका मिलीसेकंदात उत्तर मिळते की ही वेबसाईट उपलब्ध नाही, आणि फोन सुरक्षित राहतो!

---

## ४. आपल्या स्वतःच्या ॲपमध्ये हे कसे ॲड करावे? (Replication Guide)
1. `VpnService` सबक्लास करा.
2. `AndroidManifest.xml` मध्ये `BIND_VPN_SERVICE` परमिशन जोडा.
3. टनेल तयार करताना फक्त DNS पोर्ट किंवा DNS सर्व्हर ॲड्रेस रूट करा.
4. इनकमिंग UDP पोर्ट 53 पॅकेट्स पार्स करून डोमेन मॅचिंग करा आणि NXDOMAIN रिस्पॉन्स द्या.
