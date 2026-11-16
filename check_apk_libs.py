import zipfile

with zipfile.ZipFile(r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialLite_PlayProtect_Safe.apk", "r") as z:
    libs = [n for n in z.namelist() if n.startswith("lib/")]
    print(f"Total lib files in SocialLite_PlayProtect_Safe.apk: {len(libs)}")
    for l in libs[:10]:
        print(l)

with zipfile.ZipFile(r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialPurifier.apk", "r") as z:
    libs = [n for n in z.namelist() if n.startswith("lib/")]
    print(f"Total lib files in SocialPurifier.apk: {len(libs)}")
