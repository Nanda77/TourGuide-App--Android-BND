package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_life);
        // Creating list of Place Objects

        ArrayList<Place> places = new ArrayList<>();

// Setting values for place objects

        places.add(new Place(getString(R.string.nightLife_1), getString(R.string.popularity_1)));
        places.add(new Place(getString(R.string.nightLife_2), getString(R.string.popularity_2)));
        places.add(new Place(getString(R.string.nightLife_3), getString(R.string.popularity_3)));
        places.add(new Place(getString(R.string.nightLife_4), getString(R.string.popularity_4)));
        places.add(new Place(getString(R.string.nightLife_5), getString(R.string.popularity_5)));
        places.add(new Place(getString(R.string.nightLife_6), getString(R.string.popularity_6)));
        places.add(new Place(getString(R.string.nightLife_7), getString(R.string.popularity_7)));


        PlaceAdapter adapter = new PlaceAdapter(NightLife.this, places);


        ListView nightLife = (ListView) findViewById(R.id.activity_night_life);

//Linking layout to adapter

        nightLife.setAdapter(adapter);


    }
}
