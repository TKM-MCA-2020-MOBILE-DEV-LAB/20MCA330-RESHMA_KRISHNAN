package com.example.myregform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View view){
        EditText edt = findViewById(R.id.editText);
        EditText edt1 = findViewById(R.id.editText2);
        EditText edt2 = findViewById(R.id.editText3 );
        TextView txt1 =findViewById(R.id.textView);
        TextView txt2 =findViewById(R.id.textView2 );
        TextView txt3 =findViewById(R.id.textView3);
        txt1.setText("Hello "+edt .getText().toString() );
        txt2.setText("Location: "+edt1 .getText().toString() );
        txt3.setText("Email: "+edt2 .getText().toString() );
    }
}

