@echo off
echo ========================================
echo    Quick Build Test - Resource Fix
echo ========================================
echo.

echo [1/2] Stopping Gradle daemon...
call .\gradlew.bat --stop

echo.
echo [2/2] Testing build with resource fixes...
call .\gradlew.bat assembleDebug --no-daemon --max-workers=1

if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo SUCCESS! Resource issues fixed!
    echo ========================================
    echo.
    echo APK created: app\build\outputs\apk\debug\app-debug.apk
    echo.
    echo You can now run:
    echo - install-apk.bat (to install on phone)
    echo - Or copy APK manually to your phone
    echo.
) else (
    echo.
    echo ========================================
    echo Build still failing...
    echo ========================================
    echo Please check the error messages above.
    echo.
)

pause
