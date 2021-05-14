package com.example.roombai2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Place.class}, version = 1)
public abstract class ApplicationDatabase extends RoomDatabase {
    public abstract placeDao placeDao();
}

