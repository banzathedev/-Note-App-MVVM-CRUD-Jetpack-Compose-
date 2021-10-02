package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrder(val oderType: OderType) {
    class Title(oderType: OderType) : NoteOrder(oderType)
    class Date(oderType: OderType) : NoteOrder(oderType)
    class Color(oderType: OderType) : NoteOrder(oderType)

    fun copy(orderType: OderType): NoteOrder{
        return when(this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}