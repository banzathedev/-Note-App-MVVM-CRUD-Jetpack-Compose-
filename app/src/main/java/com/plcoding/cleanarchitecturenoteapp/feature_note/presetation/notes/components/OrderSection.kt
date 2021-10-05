package com.plcoding.cleanarchitecturenoteapp.feature_note.presetation.add_edit_note.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util.OderType


@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OderType.Descending),
    onOrderChanges: (NoteOrder) -> Unit
) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Title",
                selected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChanges(NoteOrder.Title(noteOrder.oderType))}
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Date",
                selected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChanges(NoteOrder.Title(noteOrder.oderType))}
            )
            Spacer(modifier = Modifier.width(8.dp))

            DefaultRadioButton(
                text = "Color",
                selected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChanges(NoteOrder.Title(noteOrder.oderType))}
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Ascending",
                selected = noteOrder.oderType is OderType.Ascending,
                onSelect = {
                    onOrderChanges(noteOrder.copy(OderType.Ascending))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Date",
                selected = noteOrder.oderType is OderType.Descending,
                onSelect = { onOrderChanges(noteOrder.copy(OderType.Descending))}
            )

            
        }
        
    }
}