package todo.desktop

import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import todo.desktop.data.FirestoreToDoRepository
import todo.desktop.presentation.ToDoScreen


@Composable
@Preview
fun App() {
    val ToDoRepository = remember { FirestoreToDoRepository()}
    ToDoScreen(ToDoRepository)

}


