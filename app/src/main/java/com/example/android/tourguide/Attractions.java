package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

// Creating list of Place Objects

        ArrayList<Place> places = new ArrayList<>();

// Setting values for place objects

        places.add(new Place(getString(R.string.attraction_1), getString(R.string.popularity_1), R.drawable.britishmuseum));
        places.add(new Place(getString(R.string.attraction_2), getString(R.string.popularity_2), R.drawable.toweroflondon));
        places.add(new Place(getString(R.string.attraction_3), getString(R.string.popularity_3), R.drawable.buckingham));
        places.add(new Place(getString(R.string.attraction_4), getString(R.string.popularity_4), R.drawable.bigben));
        places.add(new Place(getString(R.string.attraction_5), getString(R.string.popularity_5), R.drawable.madametussauds));
        places.add(new Place(getString(R.string.attraction_6), getString(R.string.popularity_6), R.drawable.towerbridge));
        places.add(new Place(getString(R.string.attraction_7), getString(R.string.popularity_7), R.drawable.londonzoo));


        PlaceAdapter adapter = new PlaceAdapter(Attractions.this, places);


        ListView attractionList = (ListView) findViewById(R.id.activity_attractions);

//Linking layout to adapter

        attractionList.setAdapter(adapter);


    }
}
