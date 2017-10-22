package com.example.android.aster2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IndirizziActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indirizzi);

        final EditText uIndirizzo = (EditText) findViewById(R.id.indirizzo_residenza);

        final EditText uCap = (EditText) findViewById(R.id.cap);

        final EditText uComuneRes = (EditText) findViewById(R.id.comune_residenza);

        final EditText uProvRes = (EditText) findViewById(R.id.prov_residenza);

        final EditText uCell = (EditText) findViewById(R.id.cellulare);

        final EditText uFisso = (EditText) findViewById(R.id.fisso);

        final EditText uEmail = (EditText) findViewById(R.id.email);

        final EditText uIban = (EditText) findViewById(R.id.iban);

        final EditText uPsw = (EditText) findViewById(R.id.password);

        final EditText uPswConf = (EditText) findViewById(R.id.conf_psw);

        final Button bRegistraz = (Button) findViewById(R.id.conf_dati_res);

        bRegistraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Benvenuto = new Intent(IndirizziActivity.this, UserAreaActivity.class);
                startActivity(Benvenuto);
            }
        });

        final Button bIndietro = (Button) findViewById(R.id.indietro);
        bIndietro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indIntent = new Intent(IndirizziActivity.this, LoginActivity.class);
                startActivity(indIntent);
            }
        });


    }
}
