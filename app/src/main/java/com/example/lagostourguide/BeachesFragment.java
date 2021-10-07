package com.example.lagostourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Beach Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.lagos_beach_1), R.drawable.beach1));
        attractions.add(new Attraction(getString(R.string.lagos_beach_2), R.drawable.beach2));
        attractions.add(new Attraction(getString(R.string.lagos_beach_3), R.drawable.beach3));
        attractions.add(new Attraction(getString(R.string.lagos_beach_4), R.drawable.beach4));
        attractions.add(new Attraction(getString(R.string.lagos_beach_5), R.drawable.beach5));
        attractions.add(new Attraction(getString(R.string.lagos_beach_6), R.drawable.beach6));
        attractions.add(new Attraction(getString(R.string.lagos_beach_7), R.drawable.beach7));
        attractions.add(new Attraction(getString(R.string.lagos_beach_8), R.drawable.beach8));
        attractions.add(new Attraction(getString(R.string.lagos_beach_9), R.drawable.beach9));
        attractions.add(new Attraction(getString(R.string.lagos_beach_10), R.drawable.beach10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}