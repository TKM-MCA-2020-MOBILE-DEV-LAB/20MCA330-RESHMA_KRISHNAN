package com.example.intent_multiple_activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);

    }

    public void multiple_intent(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("click second activity"))
        {
            Intent first = new Intent(this,SecondActivity.class);
            startActivity(first);
        }
        else if (button_text.equals("click third activity"))
        {
            Intent second = new Intent(this,ThirdActivity.class);
            startActivity(second);

        }
    }
}
