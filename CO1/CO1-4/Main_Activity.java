package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
Button button;
TextView name,number,password,mail,addr;
EditText ename,enumber,epassword,email,address;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

button = findViewById(R.id.button);
name = findViewById(R.id.textView1);
number = findViewById(R.id.textView2);
mail = findViewById(R.id.textView3);
password = findViewById(R.id.textView4);
addr=findViewById(R.id.adr);
ename= findViewById(R.id.editText);
enumber= findViewById(R.id.editText2);
email= findViewById(R.id.editText3);
epassword= findViewById(R.id.editText4);
address= findViewById(R.id.addr);

button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
login();
}
});
}
public void login() {
if (ename.getText().toString().length() == 0) {
ename.requestFocus();
ename.setError("Name is required");
return;
}
String namePattern="^[0-9!@#$%^&*]+$";
if(ename.getText().toString().matches(namePattern))
{ ename.requestFocus();
ename.setError("Enter valid name");
return;
}

String fPattern="^[A-Za-z!@#$%^&*]+[0-9!@#$%^&*]+[A-Za-
z!@#$%^&*]+$";

if(ename.getText().toString().matches(fPattern))
{ ename.requestFocus();
ename.setError("Enter valid name");
return;
}

String namPattern="^[A-Za-z!@#$%^&*]+[0-9!@#$%^&*]+$";
if(ename.getText().toString().matches(namPattern))
{ ename.requestFocus();
ename.setError("Enter valid name");
return;
}
String naPattern="^[0-9!@#$%^&*]+[A-Za-z!@#$%^&*]++$";
if(ename.getText().toString().matches(naPattern))
{ ename.requestFocus();
ename.setError("Enter valid name");
return;
}
if (address.getText().toString().length() == 0) {
address.requestFocus();
address.setError("Address is required");
return;
}
String noPattern="^[A-Za-z!@#$%^&*]+$";
if(enumber.getText().toString().matches(noPattern))
{ enumber.requestFocus();
enumber.setError("Enter valid number");
return;
}
String numPattern="^[A-Za-z]+[0-9]+[!@#$%^&*]+$";
if(enumber.getText().toString().matches(numPattern))
{ enumber.requestFocus();
enumber.setError("Enter valid number");
return;
}
String nuPattern="^[A-Za-z]+[0-9]+$";
if(enumber.getText().toString().matches(nuPattern))
{ enumber.requestFocus();
enumber.setError("Enter valid number");
return;
}
String nPattern="^[0-9]+[A-Za-z]+$";
if(enumber.getText().toString().matches(nPattern))
{ enumber.requestFocus();
enumber.setError("Enter valid number");
return;

}
String numberPattern="^[0-9]+[!@#$%^&*]+$";
if(enumber.getText().toString().matches(numberPattern))
{ enumber.requestFocus();
enumber.setError("Enter valid number");
return;
}
if (enumber.getText().toString().length() == 0) {
enumber.requestFocus();
enumber.setError("Number is required");
return;
}
if (enumber.getText().toString().length() < 10) {
enumber.requestFocus();
enumber.setError("Enter 10 digit number");
return;
}
if (enumber.getText().toString().length() >10) {
enumber.requestFocus();
enumber.setError("Enter 10 digit number");
return;
}

if (email.getText().toString().length() == 0) {
Toast.makeText(getApplicationContext(), "Invalid Email
Address", Toast.LENGTH_SHORT).show();
email.requestFocus();
email.setError("email is required");
return;
}
String emailpattern="^[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+$";
if(email.getText().toString().matches(emailpattern)) {
}
else{
email.requestFocus();
email.setError("Enter valid email");
return;
}
if (epassword.getText().toString().length() == 0)
{
epassword.requestFocus();
epassword.setError("Enter valid password");
return;

}
if (epassword.getText().toString().length() < 8) {
epassword.requestFocus();
epassword.setError("Enter minimum 8 digit password");
return;
}
}
}
