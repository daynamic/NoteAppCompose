package com.akshat.noteappcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.akshat.noteappcompose.model.Note
import com.akshat.noteappcompose.util.DateConverter
import com.akshat.noteappcompose.util.UUIDConverter

@Database(
    entities = [Note::class],
    version = 1, exportSchema = false
)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDatabaseDao

}