# How to Run FocusFlow Android App

## Prerequisites

To run the FocusFlow Android app, you need:

1. **Android Studio** (Hedgehog 2023.1.1 or later) ✅ *Already installed*
2. **Java JDK 17** ✅ *Already available*
3. **Android SDK** (API 24 or higher)
4. **Android device or emulator**

## Setup Instructions

### 1. Open the Project in Android Studio

1. Launch Android Studio
2. Select "Open an existing project"
3. Navigate to the `FocusFlow` directory and select it
4. Wait for Gradle sync to complete

### 2. Configure Android SDK (if needed)

1. Go to **File > Settings** (or **Android Studio > Preferences** on Mac)
2. Navigate to **Appearance & Behavior > System Settings > Android SDK**
3. Ensure you have:
   - Android API 24 (Android 7.0) or higher
   - Android SDK Build-Tools
   - Android SDK Platform-Tools

### 3. Set up an Android Device or Emulator

#### Option A: Physical Device
1. Enable **Developer Options** on your Android device
2. Enable **USB Debugging**
3. Connect your device via USB
4. Allow USB debugging when prompted

#### Option B: Android Emulator
1. In Android Studio, go to **Tools > AVD Manager**
2. Click **Create Virtual Device**
3. Choose a device (e.g., Pixel 6)
4. Select a system image (API 24 or higher)
5. Click **Finish** and start the emulator

### 4. Run the App

1. In Android Studio, click the **Run** button (green triangle) or press `Shift + F10`
2. Select your target device (physical device or emulator)
3. Wait for the app to build and install

## Project Structure Verification

The FocusFlow project includes:

```
FocusFlow/
├── app/
│   ├── build.gradle                 ✅ App-level build configuration
│   ├── src/main/
│   │   ├── AndroidManifest.xml      ✅ App manifest
│   │   ├── java/com/focusflow/app/
│   │   │   ├── MainActivity.kt      ✅ Main activity
│   │   │   ├── FocusFlowApplication.kt ✅ Application class
│   │   │   ├── data/                ✅ Database & repositories
│   │   │   ├── domain/              ✅ Domain models
│   │   │   ├── ui/                  ✅ UI screens & components
│   │   │   ├── utils/               ✅ Utility classes
│   │   │   ├── notifications/       ✅ Notification system
│   │   │   ├── backup/              ✅ Data export/import
│   │   │   └── di/                  ✅ Dependency injection
│   │   └── res/                     ✅ Resources (layouts, strings, etc.)
│   └── src/test/                    ✅ Unit tests
├── build.gradle                     ✅ Project-level build configuration
├── settings.gradle                  ✅ Project settings
├── gradle.properties               ✅ Gradle properties
├── gradlew & gradlew.bat           ✅ Gradle wrapper scripts
└── README.md                       ✅ Documentation
```

## Features to Test

Once the app is running, you can test these features:

### 🏠 Dashboard
- View daily summary
- Check task and habit statistics
- See today's tasks and overdue items

### ✅ Tasks
- Tap **+** to create a new task
- Set title, description, due date, priority, and category
- Mark tasks as complete by checking the checkbox
- Filter tasks by status (All, Active, Completed, Today, Overdue)
- Delete tasks using the menu (⋮)

### 📝 Todo Lists
- Create new todo lists with custom colors
- Add items to lists
- Track completion progress
- Delete lists and items

### 🎯 Habits
- Create habits with custom icons and colors
- Set frequency (Daily, Weekly, Monthly)
- Track daily completion
- View streaks and statistics

### ⚙️ Settings
- Toggle dark mode
- Export data to JSON
- Configure notifications
- Clear all data

## Troubleshooting

### Common Issues:

1. **Gradle Sync Failed**
   - Check internet connection
   - Ensure Android SDK is properly installed
   - Try **File > Sync Project with Gradle Files**

2. **App Won't Install**
   - Check device compatibility (API 24+)
   - Ensure USB debugging is enabled
   - Try cleaning and rebuilding: **Build > Clean Project**

3. **Build Errors**
   - Check that all dependencies are available
   - Ensure Java 17 is being used
   - Verify Android SDK installation

### Build Commands (Alternative)

If you prefer command line:

```bash
# Navigate to project directory
cd FocusFlow

# Build debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug

# Run tests
./gradlew test
```

## Expected App Behavior

When you first run the app:

1. **Welcome Screen**: The app starts with the Dashboard
2. **Sample Data**: Pre-populated with sample tasks, todos, and habits
3. **Navigation**: Bottom navigation with 5 tabs
4. **Material Design**: Modern UI with Material 3 design system
5. **Dark Mode**: Automatically follows system theme

## Performance Notes

- **Local Storage**: All data is stored locally using Room database
- **No Internet Required**: App works completely offline
- **Fast Performance**: Optimized with Jetpack Compose and coroutines
- **Memory Efficient**: Proper lifecycle management and data handling

## Next Steps

After running the app successfully:

1. Explore all features and screens
2. Test creating, editing, and deleting items
3. Try the export/import functionality
4. Test notifications (if permissions are granted)
5. Customize the app theme and settings

The FocusFlow app is now ready to help you manage your tasks, todos, and habits efficiently! 🚀
