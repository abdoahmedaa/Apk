# 📱 Phone Setup & APK Installation Guide

## 🔧 Step 1: Prepare Your Android Phone

### **Enable Developer Options**
1. Go to **Settings** → **About Phone** (or **About Device**)
2. Find **Build Number** and tap it **7 times**
3. You'll see "You are now a developer!" message
4. Go back to main **Settings**
5. Look for **Developer Options** (usually under System or Advanced)

### **Enable USB Debugging**
1. Open **Developer Options**
2. Find **USB Debugging** and turn it **ON**
3. If prompted, allow USB debugging

### **Connect Phone to Computer**
1. Use a **USB cable** to connect your phone
2. When prompted on phone, select **"File Transfer"** or **"MTP"**
3. Allow **USB Debugging** when the popup appears
4. Check **"Always allow from this computer"** (optional)

## 🚀 Step 2: Build the APK

### **Option A: Automatic Build & Install (Recommended)**
1. Open **Command Prompt** or **PowerShell**
2. Navigate to the FocusFlow folder:
   ```cmd
   cd D:\FocusFlow
   ```
3. Run the automated build script:
   ```cmd
   build-apk.bat
   ```
4. Wait for the build to complete (2-5 minutes)
5. The app will be automatically installed on your phone!

### **Option B: Create APK Only**
If you prefer to install manually:
1. Run:
   ```cmd
   create-apk.bat
   ```
2. APK will be created at: `app\build\outputs\apk\debug\app-debug.apk`
3. Copy this file to your phone and install manually

### **Option C: Manual Commands**
```cmd
# Clean and build
.\gradlew.bat clean assembleDebug

# Install on connected phone
.\gradlew.bat installDebug
```

## 📋 Build Process Explained

### **What Happens During Build:**
1. **Clean:** Removes old build files
2. **Download:** Gets Android SDK and dependencies (first time only)
3. **Compile:** Compiles Kotlin code and resources
4. **Package:** Creates the APK file
5. **Install:** Transfers APK to your phone and installs it

### **Expected Output:**
```
[1/4] Cleaning previous builds...
BUILD SUCCESSFUL in 15s

[2/4] Building debug APK...
> Task :app:compileDebugKotlin
> Task :app:assembleDebug
BUILD SUCCESSFUL in 2m 30s

[3/4] Checking for connected device...
List of attached devices:
ABC123DEF456    device

[4/4] Installing APK on connected device...
Installing APK 'app-debug.apk' on 'Your Phone'
BUILD SUCCESSFUL in 45s

SUCCESS: FocusFlow app installed on your device!
```

## 🔍 Troubleshooting

### **Phone Not Detected**
```cmd
# Check if phone is connected
.\gradlew.bat devices
```

**Solutions:**
- Try a different USB cable
- Enable "File Transfer" mode on phone
- Install phone drivers on computer
- Restart both phone and computer

### **Build Fails**
**Common issues:**
- **Internet required:** First build downloads ~500MB of dependencies
- **Java version:** Ensure Java 17 is installed
- **Disk space:** Need ~2GB free space for build

### **Installation Fails**
**Solutions:**
1. Uninstall any existing version:
   ```cmd
   .\gradlew.bat uninstallDebug
   ```
2. Enable "Install from Unknown Sources" on phone
3. Manually install the APK file

## 📱 Manual APK Installation

### **If Automatic Install Fails:**
1. Copy `app-debug.apk` from `app\build\outputs\apk\debug\` to your phone
2. On your phone, open **File Manager**
3. Navigate to where you copied the APK
4. Tap the **app-debug.apk** file
5. If prompted, allow "Install from unknown sources"
6. Tap **Install**
7. Tap **Open** when installation completes

## ✅ Verification

### **Check Installation Success:**
1. Look for **FocusFlow** app icon on your phone
2. Tap to open the app
3. You should see the Dashboard screen
4. Test navigation between tabs: Dashboard, Tasks, Todos, Habits, Settings

### **App Features to Test:**
- 🏠 **Dashboard:** Daily summary and statistics
- ✅ **Tasks:** Create, edit, complete tasks with priorities
- 📝 **Todos:** Create lists and add items
- 🎯 **Habits:** Track daily habits with streaks
- ⚙️ **Settings:** Toggle dark mode, export data

## 🎯 Quick Commands Summary

### **Build & Install:**
```cmd
build-apk.bat
```

### **Just Create APK:**
```cmd
create-apk.bat
```

### **Manual Commands:**
```cmd
# Build only
.\gradlew.bat assembleDebug

# Install on phone
.\gradlew.bat installDebug

# Check connected devices
.\gradlew.bat devices

# Uninstall from phone
.\gradlew.bat uninstallDebug
```

## 🚀 Ready to Build!

**Your FocusFlow app is ready to be built and installed on your phone!**

1. **Connect your phone** with USB debugging enabled
2. **Run `build-apk.bat`** in the FocusFlow folder
3. **Wait 2-5 minutes** for the build to complete
4. **Launch FocusFlow** on your phone and enjoy!

**The app will help you manage tasks, todos, and habits efficiently! 📱✨**
