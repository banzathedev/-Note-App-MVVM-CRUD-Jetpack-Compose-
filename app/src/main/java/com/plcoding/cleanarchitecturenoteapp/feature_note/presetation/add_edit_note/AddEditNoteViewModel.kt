package com.plcoding.cleanarchitecturenoteapp.feature_note.presetation.add_edit_note

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel() {

    private val _noteTitle = mutableStateOf("")
    val noteTitle: State<String> = _noteTitle

}