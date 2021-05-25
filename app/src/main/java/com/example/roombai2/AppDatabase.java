package com.example.roombai2;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
@Database(entities = {Address.class},version = 2)
public  abstract  class  AppDatabase extends RoomDatabase {
    public abstract AddressDao addressDao();

}
