package com.example.sp_with_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.tv);
        TextView textView1 = (TextView) findViewById(R.id.tv1);
        TextView textView2 = (TextView) findViewById(R.id.tv2);
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {
                EditText edt=(EditText) findViewById(R.id.edit1);
                EditText edt2=(EditText) findViewById(R.id.edit2);
                EditText edt3=(EditText) findViewById(R.id.edt3);

                String value=edt.getText().toString();
                String value1=edt2.getText().toString();
                String value2=edt3.getText().toString();
                SharedPreferences sharedpref=getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedpref.edit();
                editor.putString("key",value);
                editor.putString("add",value1);
                editor.putString("eml",value2);
                editor.apply();
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("key",value);
                i.putExtra("add",value1);
                i.putExtra("eml",value2);
                startActivity(i);


            }
        });
        SharedPreferences getsharedValue=getSharedPreferences("pref",MODE_PRIVATE);
        String val=getsharedValue.getString("key","Default Username: User ");
        String val1=getsharedValue.getString("add","Default Address: User's Location");
        String val2=getsharedValue.getString("eml","Default Email: User's Email");
        textView.setText(val);
        textView1.setText(val1);
        textView2.setText(val2);
    }
}
