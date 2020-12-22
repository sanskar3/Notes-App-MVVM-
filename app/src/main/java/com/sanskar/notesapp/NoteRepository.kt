package com.sanskar.notesapp

import androidx.lifecycle.LiveData
import androidx.room.Dao

class NoteRepository(private var noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun delete(note: Note) {
        noteDao.delete(note)
    }


}