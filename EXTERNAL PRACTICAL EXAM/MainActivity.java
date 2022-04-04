//To implement adapters and perform exception handling
package com.example.admin.exceptionhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String sports[] = {"Cricket", "FootBall", "Hockey", "Tennis", "Badminton", "VolleyBall"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // listview = (ListView)findViewById(R.id.lv);
        try {
            ArrayAdapter myadapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, sports);
            listview.setAdapter(myadapter);
        }catch(Exception e){
             Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }
}
