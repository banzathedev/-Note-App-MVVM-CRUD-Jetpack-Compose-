package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val tittle: String,
    val content: String,
    val timesTamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink, LightBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)
