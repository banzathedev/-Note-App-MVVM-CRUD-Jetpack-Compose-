package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class OderType {
    object Ascending : OderType()
    object Descending : OderType()
}
