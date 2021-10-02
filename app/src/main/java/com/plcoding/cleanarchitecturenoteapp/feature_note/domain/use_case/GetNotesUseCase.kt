package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.OderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


/* uses cases makes the code more reusable, avoiding code duplication
* but the need to have a SINGLE public fun.
* its okay to have multiple private funs for utility, but remind you should have a single one public
* notice the cases will be used by view models*/

class GetNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OderType.Descending)): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.oderType) {
                is OderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedBy { it.tittle.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timesTamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }

                }
                is OderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> notes.sortedByDescending { it.tittle.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timesTamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }

}