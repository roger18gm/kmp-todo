package todo.desktop

import android.app.Application
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.google.firebase.FirebasePlatform
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseOptions
import dev.gitlive.firebase.initialize

fun main() = application {

    FirebasePlatform.initializeFirebasePlatform(object : FirebasePlatform() {

        val storage = mutableMapOf<String, String>()
        override fun clear(key: String) {
            storage.remove(key)
        }

        override fun log(msg: String) = println(msg)

        override fun retrieve(key: String) = storage[key]

        override fun store(key: String, value: String) = storage.set(key, value)

    })

    val options = FirebaseOptions(
        projectId = "YOUR FIREBASE PROJECT ID GOES HERE",
        applicationId = "YOUR FIREBASE APPLICATION ID GOES HERE",
        apiKey = "YOUR FIREBASE API KEY GOES HERE"
    )
    Firebase.initialize(Application(), options)

    Window(
        onCloseRequest = ::exitApplication,
        title = "To-Do Application",
    ) {
        App()
    }
}

