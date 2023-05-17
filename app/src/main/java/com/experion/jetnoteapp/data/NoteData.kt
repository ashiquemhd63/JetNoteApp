package com.experion.jetnoteapp.data

import com.experion.jetnoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),



        )
    }
}