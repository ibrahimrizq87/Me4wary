package com.example.me4wary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
ListView L;
String [] S ={"قاعات مناسبات" ," سيارات ","محلات ملابس" , "محلات","صيانه"  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        L =findViewById(R.id.list);
        //final ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,S);
        final ArrayAdapter<String> adapter  = new ArrayAdapter<String>(this,R.layout.list,R.id.txt,S );
        L.setAdapter(adapter);
        L.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i = (int) parent.getItemIdAtPosition(position);
                if (i == 0){
                    startActivity(new Intent(Main3Activity.this,Hall.class));
                }else if(i == 1){
                    startActivity(new Intent(Main3Activity.this,closesShop.class));

                }else if(i == 3){
                    startActivity(new Intent(Main3Activity.this,shops.class));

                }else if(i == 4){
                    startActivity(new Intent(Main3Activity.this,fixing.class));

                }else if(i == 2){
                    startActivity(new Intent(Main3Activity.this,cars.class));

                }




                view.setSelected(true);
            }
        });
    }
}
