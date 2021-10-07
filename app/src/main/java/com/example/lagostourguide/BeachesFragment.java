package com.example.lagostourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Beach Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Elegushi Private Beach Resort", R.drawable.beach1));
        attractions.add(new Attraction("Moist Beach Club", R.drawable.beach2));
        attractions.add(new Attraction("Atican Beach Resort", R.drawable.beach3));
        attractions.add(new Attraction("Tarkwa-Bay Beach", R.drawable.beach4));
        attractions.add(new Attraction("Oniru Private Beach", R.drawable.beach5));
        attractions.add(new Attraction("Redline beach", R.drawable.beach6));
        attractions.add(new Attraction("Landmark Beach", R.drawable.beach7));
        attractions.add(new Attraction("Coconut Beach Beach", R.drawable.beach8));
        attractions.add(new Attraction("Kamp Ikare Beach Resort", R.drawable.beach9));
        attractions.add(new Attraction("Lekki Beach Resort", R.drawable.beach10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}