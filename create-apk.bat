@echo off
echo ========================================
echo    FocusFlow APK Creator
echo ========================================
echo.

echo [1/2] Cleaning previous builds...
call .\gradlew.bat clean

echo.
echo [2/2] Building debug APK...
call .\gradlew.bat assembleDebug

if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo SUCCESS! APK Created Successfully!
    echo ========================================
    echo.
    echo APK Location: app\build\outputs\apk\debug\app-debug.apk
    echo APK Size: 
    dir "app\build\outputs\apk\debug\app-debug.apk" | findstr "app-debug.apk"
    echo.
    echo You can now:
    echo 1. Copy the APK to your phone
    echo 2. Install it manually
    echo 3. Or run 'build-apk.bat' to auto-install
    echo.
) else (
    echo.
    echo ========================================
    echo BUILD FAILED!
    echo ========================================
    echo Please check the error messages above.
    echo.
)

pause
