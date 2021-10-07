package com.example.lagostourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ArtsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Museums Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.art_house_1), R.drawable.museum1));
        attractions.add(new Attraction(getString(R.string.art_house_2), R.drawable.museum2));
        attractions.add(new Attraction(getString(R.string.art_house_3), R.drawable.museum3));
        attractions.add(new Attraction(getString(R.string.art_house_4), R.drawable.museum4));
        attractions.add(new Attraction(getString(R.string.art_house_5), R.drawable.museum5));
        attractions.add(new Attraction(getString(R.string.art_house_6), R.drawable.museum6));
        attractions.add(new Attraction(getString(R.string.art_house_7), R.drawable.museum7));
        attractions.add(new Attraction(getString(R.string.art_house_8), R.drawable.museum8));
        attractions.add(new Attraction(getString(R.string.art_house_9), R.drawable.museum9));
        attractions.add(new Attraction(getString(R.string.art_house_10), R.drawable.museum10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}