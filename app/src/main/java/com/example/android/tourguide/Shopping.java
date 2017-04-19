package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);


        // Creating list of Place Objects

        ArrayList<Place> places = new ArrayList<>();

// Setting values for place objects

        places.add(new Place(getString(R.string.shopping_1), getString(R.string.popularity_1)));
        places.add(new Place(getString(R.string.shopping_2), getString(R.string.popularity_2)));
        places.add(new Place(getString(R.string.shopping_3), getString(R.string.popularity_3)));
        places.add(new Place(getString(R.string.shopping_4), getString(R.string.popularity_4)));
        places.add(new Place(getString(R.string.shopping_5), getString(R.string.popularity_5)));
        places.add(new Place(getString(R.string.shopping_6), getString(R.string.popularity_6)));
        places.add(new Place(getString(R.string.shopping_7), getString(R.string.popularity_7)));


        PlaceAdapter adapter = new PlaceAdapter(Shopping.this, places);


        ListView shoppingList = (ListView) findViewById(R.id.activity_shopping);

//Linking layout to adapter

        shoppingList.setAdapter(adapter);


    }
}
