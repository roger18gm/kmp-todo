# Kotlin Multiplatform To-Do project targeting Android and Desktop

This project demonstrates how Kotlin Multiplatform can be used to create
a cross-platform application providing real-time database CRUD operations using Firebase.

* `/composeApp` is for code that is shared across the Android and Desktop Compose Multiplatform applications.
  It contains several subfolders:
  - `/androidMain` is for code that’s specific to the Android target.
  - `commonMain` is for code that’s common for all targets.
  - `desktopMain` is for code that’s specific to the Desktop target.

## Application Structure
* `/composeApp/src/commonMain/kotlin/todo/desktop/App.kt` is the entry point for the application. It sets up the UI and the data source. Within
  this directory, you will find the rest of project code for styling, layout, and data handling.

### UI Components
* `/composeApp/src/commonMain/kotlin/todo/desktop/components/` contains the to-do item, to-do list, and to-do edit modal UI components used in the application.
* `/composeApp/src/commonMain/kotlin/todo/desktop/presentation/ToDoScreen.kt` is the main screen of the application. It displays the list of to-do items and allows the user to add new items.

### Data Handling
* `/composeApp/src/commonMain/kotlin/todo/desktop/data/FirestoreToDoRepository.kt` is the class that handles the Firebase Realtime Database operations.

### To-Do Structure
* `/composeApp/src/commonMain/kotlin/todo/desktop/domain/ToDo.kt` is the data class that represents a to-do item.
* `/composeApp/src/commonMain/kotlin/todo/desktop/domain/ToDoRepository.kt` is the interface that defines the CRUD operations for to-do items.

## Demonstration
  [To-Do Kotlin App Demo](https://www.linkedin.com/feed/update/urn:li:activity:7287499219240697857/)
    
## References
Compose starter template
https://github.com/JetBrains/compose-multiplatform-desktop-template#before-you-start

Create Compose Multiplatform project
https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html

Examples of chat and todo list app
https://github.com/JetBrains/compose-multiplatform/tree/master/examples

Compose documentation
https://developer.android.com/develop/ui/compose/modifiers

firebase kotlin sdk library
https://github.com/GitLiveApp/firebase-kotlin-sdk?tab=readme-ov-file

Video reference of KMP and firebase configuration
https://www.youtube.com/watch?v=ytJ3NrXz5bE&t=255s