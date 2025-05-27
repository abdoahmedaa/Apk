@echo off
echo ========================================
echo    FocusFlow APK Builder (Memory Optimized)
echo ========================================
echo.

echo [1/5] Stopping any running Gradle daemons...
call .\gradlew.bat --stop
timeout /t 3 /nobreak >nul

echo.
echo [2/5] Cleaning previous builds...
call .\gradlew.bat clean --no-daemon
if %errorlevel% neq 0 (
    echo ERROR: Clean failed!
    pause
    exit /b 1
)

echo.
echo [3/5] Building debug APK (this may take 3-5 minutes)...
echo Please be patient, the build process requires significant memory...
call .\gradlew.bat assembleDebug --no-daemon --max-workers=1
if %errorlevel% neq 0 (
    echo ERROR: Build failed due to memory issues!
    echo.
    echo SOLUTIONS:
    echo 1. Close other applications to free memory
    echo 2. Restart your computer and try again
    echo 3. Try the lightweight build: create-apk-lite.bat
    pause
    exit /b 1
)

echo.
echo [4/5] Checking for connected device...
call .\gradlew.bat devices --no-daemon

echo.
echo [5/5] Installing APK on connected device...
call .\gradlew.bat installDebug --no-daemon
if %errorlevel% neq 0 (
    echo WARNING: Auto-install failed. You can manually install the APK.
    echo APK Location: app\build\outputs\apk\debug\app-debug.apk
) else (
    echo SUCCESS: FocusFlow app installed on your device!
)

echo.
echo ========================================
echo Build Complete!
echo ========================================
echo APK Location: app\build\outputs\apk\debug\app-debug.apk
echo APK Size:
dir "app\build\outputs\apk\debug\app-debug.apk" 2>nul | findstr "app-debug.apk"
echo.
pause
