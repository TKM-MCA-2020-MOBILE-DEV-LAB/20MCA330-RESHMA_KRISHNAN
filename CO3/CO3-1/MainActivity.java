package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] heroes = new String[] {"Mohanlal","ShahrukhKhan","Rajnikanth","FahadhFasil","HrithikRoshan","Prithviraj","DulquerSalman","Prabhas","Yash","Tovino"};
        try {
            ArrayAdapter<String> newadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, heroes);

            lv.setAdapter(newadapter);
        }
        catch(Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();

        }
    }
}
