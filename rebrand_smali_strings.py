import os
import re

smali_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\smali"

# We want to replace "SocialLite" inside string literals: const-string vX, "..."
# But keep internal package/system strings if any.
# Let's inspect each occurrence first.

pattern = re.compile(r'(const-string(?:/jumbo)?\s+[vp]\d+,\s*)"([^"]*SocialLite[^"]*)"')

matches_found = []
for root, dirs, files in os.walk(smali_dir):
    for f in files:
        if f.endswith(".smali"):
            path = os.path.join(root, f)
            with open(path, "r", encoding="utf-8", errors="ignore") as file:
                lines = file.readlines()
            
            modified = False
            new_lines = []
            for i, line in enumerate(lines):
                m = pattern.search(line)
                if m:
                    # Ignore internal preferences file name if desired or keep it
                    # But user-facing dialogs like "SocialLite needs Accessibility access" should be "SocialPurifier..."
                    old_str = m.group(2)
                    new_str = old_str.replace("SocialLite", "SocialPurifier")
                    line = line.replace(f'"{old_str}"', f'"{new_str}"')
                    matches_found.append((os.path.relpath(path, smali_dir), i+1, old_str, new_str))
                    modified = True
                new_lines.append(line)
            
            if modified:
                with open(path, "w", encoding="utf-8") as file:
                    file.writelines(new_lines)

print(f"Replaced {len(matches_found)} string literals:")
for rel, lno, old_s, new_s in matches_found:
    print(f"[{rel}:{lno}] {old_s[:40]} -> {new_s[:40]}")
