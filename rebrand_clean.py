import re
import os
import glob

res_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\res"

# Regex to match XML tags: <string name="...">CONTENT</string>
tag_re = re.compile(r'(<string\s+name="[^"]+">)(.*?)(</string>)', re.DOTALL)

for strings_file in glob.glob(os.path.join(res_dir, "**", "strings.xml"), recursive=True):
    with open(strings_file, "r", encoding="utf-8") as f:
        content = f.read()

    def replace_val(m):
        prefix = m.group(1)
        val = m.group(2)
        suffix = m.group(3)
        # Only replace inside the text value, not the name attribute
        val = val.replace("SocialLite", "SocialPurifier")
        val = val.replace("sociallite", "socialpurifier")
        val = val.replace("SOCIALLITE", "SOCIALPURIFIER")
        return prefix + val + suffix

    new_content = tag_re.sub(replace_val, content)
    with open(strings_file, "w", encoding="utf-8") as f:
        f.write(new_content)

print("Clean string value replacement completed!")
