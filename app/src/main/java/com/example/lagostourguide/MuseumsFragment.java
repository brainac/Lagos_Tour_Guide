package com.example.lagostourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Museums Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("Vivid Exclusive Art Gallery", R.drawable.museum1));
        attractions.add(new Attraction("Iwalewa Art Gallery", R.drawable.museum2));
        attractions.add(new Attraction("Lvi Art Gallery And Cultural Nexus", R.drawable.museum3));
        attractions.add(new Attraction("Kalakuta Republic Museum", R.drawable.museum4));
        attractions.add(new Attraction("Red Door Art Gallery", R.drawable.museum5));
        attractions.add(new Attraction("The National Museum", R.drawable.museum6));
        attractions.add(new Attraction("Black Heritage Museum", R.drawable.museum7));
        attractions.add(new Attraction("Mindscape Childrens Museum", R.drawable.museum8));
        attractions.add(new Attraction("Ovuomaroro Studio and Gallery", R.drawable.museum9));
        attractions.add(new Attraction("Jaekel House", R.drawable.museum10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}