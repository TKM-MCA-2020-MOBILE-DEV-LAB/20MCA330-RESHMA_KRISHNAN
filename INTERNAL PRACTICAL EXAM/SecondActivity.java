package com.example.gasbooking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    @Override
    protected void onCreate(Bundle Bundle) {
        super.onCreate(Bundle);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        Bundle bd = i.getExtras();
        String val1 = (String) bd.get("D_code");
        String val2 = (String) bd.get("C_code");
        String val3 = (String) bd.get("Mobile");
        tv1.setText(val1);
        tv2.setText(val2);
        tv3.setText(val3);

    }
}
