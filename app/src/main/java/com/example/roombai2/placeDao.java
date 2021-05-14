package com.example.roombai2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface placeDao {
    @Query("select * from Place")

    List<Place> getAllPlace();

    @Query("select * from Place where id = :id")
    Place getPlaceById(int id);

    @Query("select * from Place order by id desc")
    Place getLastPlace();

    @Insert
    void insert(Place ...places);
}
