package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);


        // Creating list of Place Objects

        ArrayList<Place> places = new ArrayList<>();

// Setting values for place objects

        places.add(new Place(getString(R.string.restaurant_1), getString(R.string.popularity_1)));
        places.add(new Place(getString(R.string.restaurant_2), getString(R.string.popularity_2)));
        places.add(new Place(getString(R.string.restaurant_3), getString(R.string.popularity_3)));
        places.add(new Place(getString(R.string.restaurant_4), getString(R.string.popularity_4)));
        places.add(new Place(getString(R.string.restaurant_5), getString(R.string.popularity_5)));
        places.add(new Place(getString(R.string.restaurant_6), getString(R.string.popularity_6)));
        places.add(new Place(getString(R.string.restaurant_7), getString(R.string.popularity_7)));



        PlaceAdapter adapter = new PlaceAdapter(Restaurants.this, places);


        ListView restaurantList = (ListView) findViewById(R.id.activity_restaurants);

//Linking layout to adapter

        restaurantList.setAdapter(adapter);


    }
}
