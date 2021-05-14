package com.example.roombai2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private final placeDao placeDao;
    private final Context context;
    private final int layoutRes;
    private final List<Place> places;

    public CustomAdapter(com.example.roombai2.placeDao placeDao, Context context, int layoutRes, List<Place> places) {
        this.placeDao = placeDao;
        this.context = context;
        this.layoutRes = layoutRes;
        this.places = places;
    }

    @Override
    public int getCount() {
        return places.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
