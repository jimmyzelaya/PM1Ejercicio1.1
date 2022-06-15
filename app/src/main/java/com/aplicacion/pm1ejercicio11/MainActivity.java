package com.aplicacion.pm1ejercicio11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //variables
    EditText editTextN1, editTextN2;
    Button botonSumar, botonRestar,botonMultiplicar, botonDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializamos las variables
        editTextN1 = (EditText) findViewById(R.id.txtnumero1);
        editTextN2 = (EditText) findViewById(R.id.txtnumero2);

        botonSumar = (Button) findViewById(R.id.btnsuma);
        botonRestar = (Button) findViewById(R.id.btnresta);
        botonMultiplicar = (Button) findViewById(R.id.btnmultiplicacion);
        botonDividir = (Button) findViewById(R.id.btndivision);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(editTextN1.getText().toString()) ;
                n2 = Double.valueOf(editTextN2.getText().toString()) ;
                resultado = n1 + n2;


                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la suma: "+resultado);
                startActivity(intent);

            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;

                n1 = Double.valueOf(editTextN1.getText().toString()) ;
                n2 = Double.valueOf(editTextN2.getText().toString()) ;
                resultado = n1 - n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la resta: "+resultado);
                startActivity(intent);

            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(editTextN1.getText().toString()) ;
                n2 = Double.valueOf(editTextN2.getText().toString()) ;
                resultado = n1 * n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la multiplicación: "+resultado);//se crea una variable global con el nombre de resultado
                startActivity(intent);

            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1,n2, resultado;
                n1 = Double.valueOf(editTextN1.getText().toString()) ;
                n2 = Double.valueOf(editTextN2.getText().toString()) ;
                resultado = n1 / n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado","Resultado de la division: "+resultado);
                startActivity(intent);

            }
        });


    }
}