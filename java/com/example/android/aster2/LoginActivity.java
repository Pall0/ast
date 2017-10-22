package com.example.android.aster2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    final EditText uCF =(EditText) findViewById(R.id.user_cf);
    final EditText uPsw =(EditText) findViewById(R.id.psw_log);

    final Button bAccedi =(Button) findViewById(R.id.accedi);
     TextView tRegistrati=(TextView) findViewById(R.id.per_registrazione);
   tRegistrati.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent regis = new Intent(LoginActivity.this,IndirizziActivity.class);
           startActivity(regis);
       }
   });
    }}

