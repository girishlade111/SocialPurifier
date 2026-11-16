# Unified Build Script for SocialPurifier by LadeStack
$ErrorActionPreference = "Stop"

$rootDir = "c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\SocialPurifier"
$sdkJar = "C:\Users\Girish Lade\AppData\Local\Android\Sdk\platforms\android-36.1\android.jar"
$buildTools = "C:\Users\Girish Lade\AppData\Local\Android\Sdk\build-tools\36.0.0"
$javac = "C:\Program Files\Java\jdk-26.0.2\bin\javac.exe"
$outApk = "c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\APKs\SocialPurifier.apk"

# 1. Clean previous build intermediates
Remove-Item "$rootDir\build\compiled_res\*", "$rootDir\build\gen\*", "$rootDir\build\classes\*", "$rootDir\build\base.apk", "$rootDir\build\classes.dex" -Recurse -Force -ErrorAction SilentlyContinue

# 2. Compile resources with aapt2
& "$buildTools\aapt2.exe" compile --dir "$rootDir\app\src\main\res" -o "$rootDir\build\compiled_res\resources.zip"

# 3. Link resources with aapt2
& "$buildTools\aapt2.exe" link -I $sdkJar --manifest "$rootDir\app\src\main\AndroidManifest.xml" --java "$rootDir\build\gen" -o "$rootDir\build\base.apk" -A "$rootDir\app\src\main\assets" "$rootDir\build\compiled_res\resources.zip" --min-sdk-version 26 --target-sdk-version 34 --version-code 1 --version-name "1.0.0" --auto-add-overlay

# 4. Compile Java files
$srcFiles = Get-ChildItem -Path "$rootDir\app\src\main\java", "$rootDir\build\gen" -Filter *.java -Recurse | Select-Object -ExpandProperty FullName
& $javac -cp $sdkJar -d "$rootDir\build\classes" -source 17 -target 17 $srcFiles

# 5. Dex classes with d8
$classFiles = Get-ChildItem -Path "$rootDir\build\classes" -Filter *.class -Recurse | Select-Object -ExpandProperty FullName
& "$buildTools\d8.bat" --output "$rootDir\build" --min-api 26 $classFiles

# 6. Add classes.dex into base.apk
Set-Location "$rootDir\build"
& "C:\Program Files\Java\jdk-26.0.2\bin\jar.exe" uf "$rootDir\build\base.apk" classes.dex

# 7. Zipalign
& "$buildTools\zipalign.exe" -p -f 4 "$rootDir\build\base.apk" $outApk

# 8. Sign with apksigner (v1, v2, v3)
$keystore = "c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\debug.keystore"
& "$buildTools\apksigner.bat" sign --ks $keystore --ks-pass pass:android --key-pass pass:android --ks-key-alias androiddebugkey --v1-signing-enabled true --v2-signing-enabled true --v3-signing-enabled true $outApk

# 9. Verify
& "$buildTools\apksigner.bat" verify --verbose $outApk
Write-Host "SocialPurifier Build & Packaging SUCCESS: $outApk"
