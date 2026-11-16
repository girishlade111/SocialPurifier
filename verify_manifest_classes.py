import os
import xml.etree.ElementTree as ET

manifest_path = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\AndroidManifest.xml"
smali_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\smali"

tree = ET.parse(manifest_path)
root = tree.getroot()

ns = {'android': 'http://schemas.android.com/apk/res/android'}

components = []

# Check Application class
app = root.find('application')
if app is not None:
    app_name = app.get('{http://schemas.android.com/apk/res/android}name')
    if app_name:
        components.append(('Application', app_name))

    for tag in ['activity', 'service', 'receiver', 'provider']:
        for elem in app.findall(tag):
            name = elem.get('{http://schemas.android.com/apk/res/android}name')
            if name:
                components.append((tag, name))

print(f"Total components in AndroidManifest: {len(components)}")

missing = []
for tag, name in components:
    # Resolve relative class names
    if name.startswith('.'):
        full_name = "com.ladestack.socialpurifier" + name
    else:
        full_name = name
    
    # Class path in smali
    smali_rel = full_name.replace('.', os.sep) + ".smali"
    smali_full = os.path.join(smali_dir, smali_rel)
    
    if not os.path.exists(smali_full):
        missing.append((tag, name, smali_rel))

print(f"Missing components count: {len(missing)}")
for tag, name, smali_rel in missing:
    print(f"MISSING: [{tag}] {name} -> expected at smali/{smali_rel}")
