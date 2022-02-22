package com.example.me4wary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Hall extends AppCompatActivity {
    ListView listView;
    String [] title  ;
    String [] rating ;
    moveAdapter adapter ;
    int[] moviesPosterRe = {
            R.drawable.aa,
            R.drawable.bb,
            R.drawable.bemo,
            R.drawable.cc,
            R.drawable.ff,
            R.drawable.gg,
            R.drawable.hh,
            R.drawable.tt
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall);

        title =getResources().getStringArray(R.array.names);
        rating =getResources().getStringArray(R.array.locations);
        listView = (ListView)findViewById(R.id.listview);
        int i = 0 ;
        adapter= new moveAdapter(getApplicationContext(),R.layout.first_shap);
        listView.setAdapter(adapter);

        for (String titles : title){

            moviesDataProvider dataProvider = new moviesDataProvider(moviesPosterRe[i],title[i],rating[i]);
            adapter.add_object(dataProvider);
            i++;
        }
    }
}
