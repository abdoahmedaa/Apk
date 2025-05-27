# FocusFlow - Task, Todo & Habit Tracker

A full-featured Android app built with Kotlin and Jetpack Compose that helps users manage Tasks, To-Dos, and Habits with all data stored locally on the device.

## Features

### 📋 Task Management
- Create, edit, and delete tasks
- Set due dates, priorities, and categories
- Mark tasks as completed/incomplete
- Filter tasks by status, priority, and date
- Local notifications for task reminders

### 📝 Todo Lists
- Create multiple todo lists with custom colors
- Add, edit, and delete todo items
- Track completion progress
- Organize tasks by categories

### 🎯 Habit Tracking
- Create daily, weekly, or custom frequency habits
- Track completion with calendar view
- View progress streaks and statistics
- Set habit reminders
- Custom icons and colors for habits

### 🏠 Dashboard
- Daily summary of tasks and habits
- Quick stats and progress overview
- Today's tasks and overdue items
- Habit completion status

### ⚙️ Settings & Data Management
- Dark mode support
- Export/import data to JSON
- Local backup and restore
- Clear all data option

## Architecture

The app follows **MVVM (Model-View-ViewModel)** architecture with:

- **UI Layer**: Jetpack Compose with Material 3 design
- **Domain Layer**: Use cases and domain models
- **Data Layer**: Room database with Repository pattern
- **Dependency Injection**: Hilt
- **Asynchronous Operations**: Coroutines and Flow

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM + Repository Pattern
- **Database**: Room (SQLite)
- **Dependency Injection**: Hilt
- **Async Programming**: Coroutines & Flow
- **Navigation**: Navigation Compose
- **Design System**: Material 3
- **Testing**: JUnit, Mockito
- **Build System**: Gradle

## Project Structure

```
app/src/main/java/com/focusflow/app/
├── data/
│   ├── database/
│   │   ├── entities/          # Room entities
│   │   ├── dao/              # Data Access Objects
│   │   └── converters/       # Type converters
│   └── repository/           # Repository implementations
├── domain/
│   └── model/               # Domain models
├── ui/
│   ├── components/          # Reusable UI components
│   ├── screens/            # Screen composables
│   │   ├── dashboard/
│   │   ├── tasks/
│   │   ├── todos/
│   │   ├── habits/
│   │   └── settings/
│   ├── navigation/         # Navigation setup
│   └── theme/             # App theme and styling
├── utils/                 # Utility classes
├── notifications/         # Notification management
├── backup/               # Data export/import
└── di/                   # Dependency injection modules
```

## Setup Instructions

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or later
- Android SDK API 24 (Android 7.0) or higher
- Kotlin 1.9.10 or later

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/focusflow.git
   cd focusflow
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned directory and select it

3. **Sync the project**
   - Android Studio will automatically sync the project
   - Wait for Gradle sync to complete

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

### Building the APK

To build a release APK:

```bash
./gradlew assembleRelease
```

The APK will be generated in `app/build/outputs/apk/release/`

## Database Schema

### Tasks Table
- `id` (Primary Key)
- `title`, `description`
- `dueDate`, `priority`, `category`
- `isCompleted`, `hasReminder`, `reminderTime`
- `createdAt`, `updatedAt`

### Todo Lists Table
- `id` (Primary Key)
- `title`, `description`, `color`
- `createdAt`, `updatedAt`

### Todo Items Table
- `id` (Primary Key)
- `todoListId` (Foreign Key)
- `title`, `isCompleted`, `position`
- `createdAt`, `updatedAt`

### Habits Table
- `id` (Primary Key)
- `title`, `description`, `frequency`, `targetCount`
- `color`, `icon`, `isActive`
- `hasReminder`, `reminderTime`
- `createdAt`, `updatedAt`

### Habit Logs Table
- `id` (Primary Key)
- `habitId` (Foreign Key)
- `date`, `count`, `notes`
- `createdAt`

## Key Features Implementation

### Local Data Storage
- All data is stored locally using Room database
- No internet connection required
- Data persists across app restarts

### Notifications
- Local notifications for task and habit reminders
- Uses Android's AlarmManager for scheduling
- Customizable notification settings

### Data Export/Import
- Export all data to JSON format
- Import data from JSON files
- Backup and restore functionality

### Dark Mode Support
- Automatic dark/light theme switching
- Follows system theme preferences
- Manual theme toggle in settings

## Testing

Run unit tests:
```bash
./gradlew test
```

Run instrumented tests:
```bash
./gradlew connectedAndroidTest
```

## Sample Data

The app includes sample data for testing:
- 5 sample tasks with different priorities and due dates
- 3 sample todo lists with items
- 5 sample habits with tracking logs

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Built with [Jetpack Compose](https://developer.android.com/jetpack/compose)
- Uses [Material 3](https://m3.material.io/) design system
- Icons from [Material Icons](https://fonts.google.com/icons)

## Screenshots

[Add screenshots of your app here]

## Future Enhancements

- [ ] Widget support for home screen
- [ ] Biometric authentication
- [ ] Advanced habit analytics
- [ ] Task templates
- [ ] Collaboration features
- [ ] Cloud sync (optional)
- [ ] Voice input for tasks
- [ ] Calendar integration
