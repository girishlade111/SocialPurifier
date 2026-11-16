import os
import glob
import shutil

root_dir = r"c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier"
smali_dir = os.path.join(root_dir, "smali")

old_pkg_slash = "Lcom/sociallite/android/"
new_pkg_slash = "Lcom/ladestack/socialpurifier/"

old_pkg_dot = "com.sociallite.android"
new_pkg_dot = "com.ladestack.socialpurifier"

modified_count = 0

print("Scanning and replacing in all smali files...")
for root, dirs, files in os.walk(smali_dir):
    for file in files:
        if file.endswith(".smali"):
            fpath = os.path.join(root, file)
            with open(fpath, "r", encoding="utf-8", errors="ignore") as f:
                content = f.read()
            if old_pkg_slash in content or old_pkg_dot in content:
                content = content.replace(old_pkg_slash, new_pkg_slash)
                content = content.replace(old_pkg_dot, new_pkg_dot)
                with open(fpath, "w", encoding="utf-8") as f:
                    f.write(content)
                modified_count += 1

print(f"Modified {modified_count} smali files.")

# Move smali/com/sociallite/android -> smali/com/ladestack/socialpurifier
old_folder = os.path.join(smali_dir, "com", "sociallite", "android")
new_folder = os.path.join(smali_dir, "com", "ladestack", "socialpurifier")

if os.path.exists(old_folder):
    os.makedirs(os.path.join(smali_dir, "com", "ladestack"), exist_ok=True)
    if os.path.exists(new_folder):
        shutil.rmtree(new_folder)
    shutil.move(old_folder, new_folder)
    print(f"Moved directory {old_folder} to {new_folder}")
    # Remove empty old sociallite dir if empty
    parent_old = os.path.join(smali_dir, "com", "sociallite")
    if os.path.exists(parent_old) and not os.listdir(parent_old):
        os.rmdir(parent_old)

# Update AndroidManifest.xml
manifest_path = os.path.join(root_dir, "AndroidManifest.xml")
with open(manifest_path, "r", encoding="utf-8") as f:
    m_content = f.read()

m_content = m_content.replace(old_pkg_dot, new_pkg_dot)
with open(manifest_path, "w", encoding="utf-8") as f:
    f.write(m_content)
print("Updated AndroidManifest.xml")

# Update public.xml
public_path = os.path.join(root_dir, "res", "values", "public.xml")
if os.path.exists(public_path):
    with open(public_path, "r", encoding="utf-8") as f:
        p_content = f.read()
    p_content = p_content.replace(old_pkg_dot, new_pkg_dot)
    with open(public_path, "w", encoding="utf-8") as f:
        f.write(p_content)
    print("Updated public.xml")

print("Package Refactoring to com.ladestack.socialpurifier DONE!")
