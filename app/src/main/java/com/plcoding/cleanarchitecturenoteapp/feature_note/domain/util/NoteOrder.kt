package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrder(val oderType: OderType) {
    class Title(oderType: OderType) : NoteOrder(oderType)
    class Date(oderType: OderType) : NoteOrder(oderType)
    class Color(oderType: OderType) : NoteOrder(oderType)
}