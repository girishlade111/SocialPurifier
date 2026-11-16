$files = Get-ChildItem -Path "c:\Users\Girish Lade\OneDrive\Desktop\SocialLite\apktool_purifier\res" -Filter "strings.xml" -Recurse
Write-Host "Found $($files.Count) strings.xml files."

foreach ($f in $files) {
    $content = [System.IO.File]::ReadAllText($f.FullName)
    $content = $content -replace "SocialLite", "SocialPurifier"
    $content = $content -replace "sociallite", "socialpurifier"
    $content = $content -replace "SOCIALLITE", "SOCIALPURIFIER"
    [System.IO.File]::WriteAllText($f.FullName, $content)
}

Write-Host "Rebranding in all strings.xml completed successfully!"
