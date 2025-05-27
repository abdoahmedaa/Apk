@echo off
echo ========================================
echo    Testing Icon Compilation
echo ========================================
echo.

echo Testing Kotlin compilation with icon fixes...
call .\gradlew.bat compileDebugKotlin --no-daemon --max-workers=1

if %errorlevel% equ 0 (
    echo.
    echo ========================================
    echo SUCCESS! Icons fixed!
    echo ========================================
    echo.
    echo Now building full APK...
    call .\gradlew.bat assembleDebug --no-daemon --max-workers=1
    
    if %errorlevel% equ 0 (
        echo.
        echo ========================================
        echo APK BUILD SUCCESSFUL!
        echo ========================================
        echo APK Location: app\build\outputs\apk\debug\app-debug.apk
    else (
        echo.
        echo APK build failed, but Kotlin compilation works.
    )
) else (
    echo.
    echo ========================================
    echo Icon issues still exist
    echo ========================================
    echo Please check the error messages above.
)

pause
