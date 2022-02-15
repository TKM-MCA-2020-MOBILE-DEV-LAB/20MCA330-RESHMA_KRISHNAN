package com.example.gasbooking_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText edt1, edt2, edt3;
    TextView textView, textView1, textView2;

    @Override
    protected void onCreate(Bundle Bundle) {
        super.onCreate(Bundle);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.dcode);
        edt2=(EditText)findViewById(R.id.ccode);
        edt3=(EditText)findViewById(R.id.mobile);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener(){

            public void onClick(View v){
                String d_code, c_code,mob_no;
                d_code = edt1.getText().toString();
                c_code = edt2.getText().toString();
                mob_no = edt3.getText().toString();

                SharedPreferences sp = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                editor.putString("D_code",d_code);
                editor.putString("C_code",c_code);
                editor.putString("Mobile",mob_no);

                editor.apply();

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("D_code",d_code);
                i.putExtra("C_code",c_code);
                i.putExtra("Mobile",mob_no);

                startActivity(i);
            }
        });
        SharedPreferences getsharedValue=getSharedPreferences("pref",MODE_PRIVATE);
        String val=getsharedValue.getString("D_code","Default Distributor No: 101 ");
        String val1=getsharedValue.getString("C_code","Default Consumer No: 101");
        String val2=getsharedValue.getString("Mobile","Default Mobile: Consumer's Email");
        textView=(TextView)findViewById(R.id.distrcode);
        textView1=(TextView)findViewById(R.id.conscode);
        textView2=(TextView)findViewById(R.id.m_no);
        textView.setText(val);
        textView1.setText(val1);
        textView2.setText(val2);
    }

}
