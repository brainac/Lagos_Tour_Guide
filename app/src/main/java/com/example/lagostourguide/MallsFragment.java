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
        attractions.add(new Attraction(getString(R.string.lagos_mall_1), R.drawable.mall1));
        attractions.add(new Attraction(getString(R.string.lagos_mall_2), R.drawable.mall2));
        attractions.add(new Attraction(getString(R.string.lagos_mall_3), R.drawable.mall3));
        attractions.add(new Attraction(getString(R.string.lagos_mall_4), R.drawable.mall4));
        attractions.add(new Attraction(getString(R.string.lagos_mall_5), R.drawable.mall5));
        attractions.add(new Attraction(getString(R.string.lagos_mall_6), R.drawable.mall6));
        attractions.add(new Attraction(getString(R.string.lagos_mall_7), R.drawable.mall7));
        attractions.add(new Attraction(getString(R.string.lagos_mall_8), R.drawable.mall8));
        attractions.add(new Attraction(getString(R.string.lagos_mall_9), R.drawable.mall9));
        attractions.add(new Attraction(getString(R.string.lagos_mall_10), R.drawable.mall10));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}