@echo off
echo ========================================
echo    FocusFlow APK Creator (Lite Mode)
echo    For systems with limited memory
echo ========================================
echo.

echo IMPORTANT: Please close all other applications before proceeding!
echo This build uses minimal memory settings.
echo.
pause

echo [1/4] Stopping all Gradle processes...
call .\gradlew.bat --stop
timeout /t 5 /nobreak >nul

echo.
echo [2/4] Cleaning build cache...
call .\gradlew.bat clean --no-daemon --no-build-cache
if %errorlevel% neq 0 (
    echo ERROR: Clean failed!
    pause
    exit /b 1
)

echo.
echo [3/4] Building APK with minimal memory usage...
echo This will take 5-10 minutes. Please be patient...
echo.

REM Set minimal JVM options for this build only
set GRADLE_OPTS=-Xmx1024m -XX:MaxMetaspaceSize=256m -XX:+UseSerialGC

call .\gradlew.bat assembleDebug --no-daemon --no-build-cache --no-parallel --max-workers=1 --no-configuration-cache
if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo SUCCESS! APK Created Successfully!
    echo ========================================
    echo.
    echo APK Location: app\build\outputs\apk\debug\app-debug.apk
    echo.
    if exist "app\build\outputs\apk\debug\app-debug.apk" (
        echo APK Size: 
        dir "app\build\outputs\apk\debug\app-debug.apk" | findstr "app-debug.apk"
        echo.
        echo You can now:
        echo 1. Copy the APK to your phone
        echo 2. Install it manually
        echo 3. Or run 'install-apk.bat' to auto-install
    ) else (
        echo ERROR: APK file not found!
    )
) else (
    echo.
    echo ========================================
    echo BUILD FAILED!
    echo ========================================
    echo.
    echo TROUBLESHOOTING:
    echo 1. Restart your computer to free memory
    echo 2. Close ALL other applications
    echo 3. Try building in Safe Mode
    echo 4. Check if you have at least 4GB free RAM
    echo.
)

echo.
echo [4/4] Cleaning up...
call .\gradlew.bat --stop
set GRADLE_OPTS=

pause
