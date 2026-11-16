import os

smali_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\smali"
found = []

for root, dirs, files in os.walk(smali_dir):
    for f in files:
        if f.endswith(".smali"):
            path = os.path.join(root, f)
            with open(path, "r", encoding="utf-8", errors="ignore") as file:
                content = file.read()
                if "SocialPurifier" in content:
                    found.append(path)

print(f"Total files referencing SocialPurifier: {len(found)}")
for p in found:
    print(p)
