package com.aplicacion.pm1ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityResultado extends AppCompatActivity {

    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultado = (TextView) findViewById(R.id.txtresultado);
        //limpia la caja antes de enviar informacion
        resultado.setText("");
        //Mando a llamar el resultado
        resultado.setText(getIntent().getStringExtra("resultado").toString());

        btnVolver=(Button) findViewById(R.id.btnVolver);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
}