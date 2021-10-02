package com.plcoding.cleanarchitecturenoteapp.feature_note.presetation.add_edit_note

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val notesUseCases: NoteUseCases
) : ViewModel() {

}