package com.experion.jetnoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.experion.jetnoteapp.data.NotesDataSource
import com.experion.jetnoteapp.model.Note
import com.experion.jetnoteapp.screen.NoteScreen
import com.experion.jetnoteapp.screen.NoteViewModel
import com.experion.jetnoteapp.ui.theme.JetNoteAppTheme
//import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val notes = remember {
                        mutableStateListOf<Note>()
                    }

                    NoteScreen(notes = notes,
                        onAddNote = {
                            notes.add(it)
                        },
                        onRemoveNote = {
                            notes.remove(it)

                        })
                }
            }
        }
    }
}

@Composable
fun NotesApp(
//    noteViewModel: NoteViewModel = viewModel()
) {


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetNoteAppTheme {

    }
}