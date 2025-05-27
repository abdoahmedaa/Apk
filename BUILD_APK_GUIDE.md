# 📱 Build FocusFlow APK - Command Line Guide

## 🚀 Quick Start - Build APK Without Android Studio

### **Prerequisites** ✅
- Java 17 installed ✅ (Already confirmed)
- Android SDK (will be downloaded automatically by Gradle)
- USB cable for phone connection
- Developer options enabled on phone

### **Step 1: Enable Developer Options on Your Phone**
1. Go to **Settings > About Phone**
2. Tap **Build Number** 7 times
3. Go back to **Settings > Developer Options**
4. Enable **USB Debugging**
5. Connect phone via USB and allow debugging

### **Step 2: Build Debug APK**
Open Command Prompt/PowerShell in the FocusFlow directory and run:

```bash
# Clean previous builds
gradlew.bat clean

# Build debug APK
gradlew.bat assembleDebug
```

### **Step 3: Install APK on Connected Phone**
```bash
# Install directly to connected phone
gradlew.bat installDebug
```

### **Alternative: Manual APK Installation**
If automatic install doesn't work:

```bash
# Just build the APK
gradlew.bat assembleDebug

# APK will be created at:
# app\build\outputs\apk\debug\app-debug.apk
```

Then manually copy the APK to your phone and install it.

## 📋 Complete Build Commands

### **Debug Build (Recommended for Testing)**
```bash
# Clean build
gradlew.bat clean

# Build debug APK
gradlew.bat assembleDebug

# Install on connected device
gradlew.bat installDebug

# Or build and install in one command
gradlew.bat clean assembleDebug installDebug
```

### **Release Build (For Distribution)**
```bash
# Build release APK (unsigned)
gradlew.bat assembleRelease

# APK location: app\build\outputs\apk\release\app-release-unsigned.apk
```

## 🔍 Build Process Monitoring

### **Check Build Progress**
The build process will show:
```
> Task :app:preBuild
> Task :app:preDebugBuild
> Task :app:compileDebugKotlin
> Task :app:processDebugResources
> Task :app:assembleDebug

BUILD SUCCESSFUL in 2m 15s
```

### **APK Output Location**
```
📁 FocusFlow/
└── 📁 app/
    └── 📁 build/
        └── 📁 outputs/
            └── 📁 apk/
                ├── 📁 debug/
                │   └── 📄 app-debug.apk          ← Debug APK
                └── 📁 release/
                    └── 📄 app-release-unsigned.apk ← Release APK
```

## 📱 Phone Connection & Installation

### **Verify Phone Connection**
```bash
# Check if phone is detected
gradlew.bat devices

# Should show your connected device
```

### **Manual APK Transfer**
If automatic installation fails:
1. Copy `app-debug.apk` to your phone
2. Open file manager on phone
3. Tap the APK file
4. Allow "Install from unknown sources" if prompted
5. Install the app

## 🛠️ Troubleshooting

### **Common Issues & Solutions**

#### **1. Gradle Sync Issues**
```bash
# Force refresh dependencies
gradlew.bat --refresh-dependencies assembleDebug
```

#### **2. Build Cache Issues**
```bash
# Clear Gradle cache
gradlew.bat clean
gradlew.bat cleanBuildCache
```

#### **3. SDK Download Issues**
```bash
# Build with info for debugging
gradlew.bat assembleDebug --info
```

#### **4. Phone Not Detected**
- Check USB debugging is enabled
- Try different USB cable
- Install phone drivers if needed
- Use `adb devices` to verify connection

#### **5. Installation Failed**
```bash
# Uninstall previous version first
gradlew.bat uninstallDebug

# Then install fresh
gradlew.bat installDebug
```

## ⚡ Quick Commands Reference

### **Essential Commands**
```bash
# Build only
gradlew.bat assembleDebug

# Build and install
gradlew.bat installDebug

# Clean and build
gradlew.bat clean assembleDebug

# Uninstall from phone
gradlew.bat uninstallDebug

# Run tests
gradlew.bat test

# Check for issues
gradlew.bat check
```

### **Build Variants**
```bash
# Debug (with debugging info)
gradlew.bat assembleDebug

# Release (optimized)
gradlew.bat assembleRelease
```

## 📊 Expected Build Time & Size

### **Build Performance**
- **First Build:** 3-5 minutes (downloads dependencies)
- **Subsequent Builds:** 30-60 seconds
- **Clean Builds:** 1-2 minutes

### **APK Size**
- **Debug APK:** ~8-12 MB
- **Release APK:** ~5-8 MB (optimized)

## ✅ Success Indicators

### **Build Success**
```
BUILD SUCCESSFUL in 1m 23s
45 actionable tasks: 45 executed
```

### **Installation Success**
```
> Task :app:installDebug
Installing APK 'app-debug.apk' on 'Your Phone Name'
Installed on 1 device.

BUILD SUCCESSFUL
```

## 🎯 Final Steps

### **After Successful Build**
1. ✅ APK created in `app\build\outputs\apk\debug\`
2. ✅ App installed on your phone
3. ✅ Look for "FocusFlow" app icon
4. ✅ Launch and test all features

### **App Features to Test**
- 🏠 Dashboard with daily summary
- ✅ Tasks with priorities and filters
- 📝 Todo lists with progress tracking
- 🎯 Habits with streak tracking
- ⚙️ Settings with dark mode

## 🚀 Ready to Build!

**Run this single command to build and install:**
```bash
gradlew.bat clean assembleDebug installDebug
```

**Your FocusFlow app will be ready to use on your phone! 📱**
