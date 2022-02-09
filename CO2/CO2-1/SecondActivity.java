package com.example.sp_with_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button b2;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_second);
        b2 = (Button)findViewById(R.id.button1);
        Intent i=getIntent();
        TextView display=findViewById(R.id.t1);
        TextView display1=findViewById(R.id.t2);
        TextView display2=findViewById(R.id.t3);
        Bundle bd=i.getExtras();
        String info=(String)  bd.get("key");
        String info1=(String)  bd.get("add");
        String info2=(String)  bd.get("eml");
        display.setText(info);
        display1.setText(info1);
        display2.setText(info2);
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
