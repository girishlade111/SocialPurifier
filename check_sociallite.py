import os

smali_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\smali"
found = {}

for root, dirs, files in os.walk(smali_dir):
    for f in files:
        if f.endswith(".smali"):
            path = os.path.join(root, f)
            with open(path, "r", encoding="utf-8", errors="ignore") as file:
                lines = file.readlines()
                for i, line in enumerate(lines):
                    if "SocialLite" in line:
                        found.setdefault(path, []).append((i+1, line.strip()))

print(f"Total files with SocialLite: {len(found)}")
for p, matches in list(found.items()):
    rel = os.path.relpath(p, smali_dir)
    print(f"\n{rel}:")
    for lno, text in matches[:4]:
        print(f"  L{lno}: {text}")
