package com.example.sqlite_ins_sel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //References to buttons and other controls of the layout
    Button btnView, btnAdd;
    EditText edt1, edt2;
    Switch status;
    ListView lView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnView = findViewById(R.id.viewbutton);
        btnAdd = findViewById(R.id.button3);
        edt1 = findViewById(R.id.cname);
        //edt2 = findViewById(R.id.c_age);
        status = findViewById(R.id.active);
        lView = findViewById(R.id.lv);


        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"View All Button",Toast.LENGTH_LONG).show();
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer customer = new Customer();
                try {
                   customer = new Customer(1,Integer.parseInt(edt2.getText().toString()), edt1.getText().toString(), status.isChecked());

                    Toast.makeText(MainActivity.this, customer.toString(), Toast.LENGTH_LONG).show();
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();

                }
                DbHelper assistant = new DbHelper(MainActivity.this);
                boolean result = assistant.dbInsert(customer);
                Toast.makeText(MainActivity.this,"SUCCESS = "+result,Toast.LENGTH_LONG).show();
            }
        });
    }

}
