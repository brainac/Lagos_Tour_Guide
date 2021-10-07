package com.example.lagostourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView locationTextView = listItemView.findViewById(R.id.Name_textView);

        locationTextView.setText(currentAttraction.getMyTourLocationTitle());

        ImageView imageView = listItemView.findViewById(R.id.location_imageView);

        imageView.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }

}
