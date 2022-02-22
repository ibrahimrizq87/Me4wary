package com.example.me4wary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class cars extends AppCompatActivity {
    ListView L;
    String [] S ={"ميكانيكا" ," سمكرة "," معرض سيارات " , "قطع غيار"  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
        L =findViewById(R.id.list);
        //final ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,S);
        final ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,R.layout.list,R.id.txt,S );
        L.setAdapter(adapter);
        L.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i = (int) parent.getItemIdAtPosition(position);
                if (i == 0){

                    startActivity(new Intent(cars.this,cars1.class));

                }else if(i == 1){
                    startActivity(new Intent(cars.this,cars2.class));

                }else if(i == 2){
                    startActivity(new Intent(cars.this,cars3.class));

                }else if(i == 3){
                    startActivity(new Intent(cars.this,cars4.class));

                }




                view.setSelected(true);
            }
        });
    }
}
