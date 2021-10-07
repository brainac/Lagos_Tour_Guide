package com.example.lagostourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of Mall Attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("City Mall Lagos", R.drawable.mall1));
        attractions.add(new Attraction("The Lennox Mall", R.drawable.mall2));
        attractions.add(new Attraction("Domino E-centre Mall", R.drawable.mall3));
        attractions.add(new Attraction("Apapa Mall", R.drawable.mall4));
        attractions.add(new Attraction("Circle Mall", R.drawable.mall5));
        attractions.add(new Attraction("Redline mall", R.drawable.mall6));
        attractions.add(new Attraction("Festival Mall", R.drawable.mall7));
        attractions.add(new Attraction("Maryland Mall", R.drawable.mall8));
        attractions.add(new Attraction("Novare Mall", R.drawable.mall9));
        attractions.add(new Attraction("Funderland Mall", R.drawable.mall10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}