@echo off
echo ========================================
echo    FocusFlow APK Installer
echo ========================================
echo.

if not exist "app\build\outputs\apk\debug\app-debug.apk" (
    echo ERROR: APK file not found!
    echo Please build the APK first using:
    echo - build-apk.bat
    echo - create-apk.bat
    echo - create-apk-lite.bat
    echo.
    pause
    exit /b 1
)

echo APK found: app\build\outputs\apk\debug\app-debug.apk
echo.

echo [1/3] Checking for connected device...
call .\gradlew.bat devices --no-daemon
if %errorlevel% neq 0 (
    echo ERROR: Cannot detect devices. Make sure:
    echo 1. Phone is connected via USB
    echo 2. USB Debugging is enabled
    echo 3. Phone drivers are installed
    echo.
    pause
    exit /b 1
)

echo.
echo [2/3] Uninstalling previous version (if exists)...
call .\gradlew.bat uninstallDebug --no-daemon
REM Ignore errors here as app might not be installed

echo.
echo [3/3] Installing FocusFlow APK...
call .\gradlew.bat installDebug --no-daemon
if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo SUCCESS! FocusFlow Installed!
    echo ========================================
    echo.
    echo The app is now installed on your phone.
    echo Look for the "FocusFlow" icon and tap to open.
    echo.
    echo Features to test:
    echo - Dashboard with daily summary
    echo - Tasks with priorities and filters
    echo - Todo lists with progress tracking
    echo - Habits with streak tracking
    echo - Settings with dark mode
    echo.
) else (
    echo.
    echo ========================================
    echo INSTALLATION FAILED!
    echo ========================================
    echo.
    echo MANUAL INSTALLATION:
    echo 1. Copy app\build\outputs\apk\debug\app-debug.apk to your phone
    echo 2. Open the file on your phone
    echo 3. Allow "Install from unknown sources" if prompted
    echo 4. Tap Install
    echo.
)

pause
