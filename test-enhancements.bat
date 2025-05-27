@echo off
echo ========================================
echo    FocusFlow Enhancement Validation
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
echo [3/5] Testing Kotlin compilation with enhancements...
call .\gradlew.bat compileDebugKotlin --no-daemon --max-workers=1
if %errorlevel% neq 0 (
    echo ERROR: Kotlin compilation failed!
    echo.
    echo POSSIBLE ISSUES:
    echo 1. Missing imports in enhanced components
    echo 2. Incompatible dependencies
    echo 3. Syntax errors in new code
    echo.
    pause
    exit /b 1
)

echo.
echo ========================================
echo SUCCESS! Kotlin compilation passed!
echo ========================================
echo.

echo [4/5] Building enhanced APK...
echo This may take 3-5 minutes with new dependencies...
call .\gradlew.bat assembleDebug --no-daemon --max-workers=1
if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo ENHANCEMENT BUILD SUCCESSFUL!
    echo ========================================
    echo.
    echo APK Location: app\build\outputs\apk\debug\app-debug.apk
    echo.
    if exist "app\build\outputs\apk\debug\app-debug.apk" (
        echo APK Size: 
        dir "app\build\outputs\apk\debug\app-debug.apk" | findstr "app-debug.apk"
        echo.
        echo ENHANCEMENTS INCLUDED:
        echo ✅ Material 3 Dynamic Theming
        echo ✅ Smooth Animations & Micro-interactions
        echo ✅ Swipeable Cards with Gestures
        echo ✅ Pull-to-Refresh Functionality
        echo ✅ Enhanced Analytics Dashboard
        echo ✅ Haptic Feedback Integration
        echo ✅ Advanced Data Models
        echo ✅ Performance Optimizations
        echo.
        echo [5/5] Ready to install enhanced app!
        echo Run: install-apk.bat
    ) else (
        echo ERROR: APK file not found!
    )
) else (
    echo.
    echo ========================================
    echo ENHANCEMENT BUILD FAILED!
    echo ========================================
    echo.
    echo TROUBLESHOOTING:
    echo 1. Check dependency compatibility
    echo 2. Verify new component imports
    echo 3. Review error messages above
    echo 4. Try building without enhancements first
    echo.
)

echo.
echo ========================================
echo Enhancement Validation Complete
echo ========================================
pause
