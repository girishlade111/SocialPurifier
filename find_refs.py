import os

smali_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\smali"
count = 0
matches = []

for root, dirs, files in os.walk(smali_dir):
    for f in files:
        if f.endswith(".smali"):
            path = os.path.join(root, f)
            with open(path, "r", encoding="utf-8", errors="ignore") as file:
                content = file.read()
                if "SocialLiteApplication" in content:
                    count += 1
                    matches.append(path)

print(f"Total files with SocialLiteApplication: {count}")
for m in matches:
    print(m)
