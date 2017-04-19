package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Find the view which initialises
        TextView attractions = (TextView) findViewById(R.id.attractions);

//Intialising OnClickListener for the view

        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, Attractions.class);

                startActivity(attractionsIntent);

            }
        });


//Find the view which initialises
        TextView shopping = (TextView) findViewById(R.id.shopping);

//Intialising OnClickListener for the view

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);

                startActivity(shoppingIntent);

            }
        });


//Find the view which initialises
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

//Intialising OnClickListener for the view

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);

                startActivity(restaurantsIntent);

            }
        });


//Find the view which initialises
        TextView nightLife = (TextView) findViewById(R.id.nightLife);

//Intialising OnClickListener for the view

        nightLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLife.class);

                startActivity(nightLifeIntent);

            }
        });


    }
}
