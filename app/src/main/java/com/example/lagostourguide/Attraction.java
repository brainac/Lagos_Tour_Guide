package com.example.lagostourguide;

public class Attraction {
    // Name of Location which a tourist can visit

    private final String myTourLocation;

    // Image resource ID for the Locations which can be visited

    private int mImageResourceId;

    public Attraction(String tourLocation, int imageResourceId) {
        myTourLocation = tourLocation;
        mImageResourceId = imageResourceId;
    }

    // This gets the name of the Location

    public String getMyTourLocationTitle() {
        return myTourLocation;
    }

    // This Returns the image resource ID of the Location.

    public int getImageResourceId() {
        return mImageResourceId;
    }
}