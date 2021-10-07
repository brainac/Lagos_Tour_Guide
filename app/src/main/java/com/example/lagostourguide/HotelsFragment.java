package com.example.lagostourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Hotel Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.lagos_hotel_1), R.drawable.hotel_1));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_2), R.drawable.hotel_2));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_3), R.drawable.hotel_3));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_4), R.drawable.hotel_4));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_5), R.drawable.hotel_5));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_6), R.drawable.hotel_6));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_7), R.drawable.hotel_7));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_8), R.drawable.hotel_8));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_9), R.drawable.hotel_9));
        attractions.add(new Attraction(getString(R.string.lagos_hotel_10), R.drawable.hotel_10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}