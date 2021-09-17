package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonEvento = (Button) findViewById(R.id.botonEvento);
        botonEvento.setOnClickListener(this);

        Button botonEvento2 = (Button) findViewById(R.id.botonEvento2);
        botonEvento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());

                int resta = n1 - n2;

                TextView mensaje = (TextView) findViewById(R.id.Textmensaje);
                mensaje.setText("La Resta es : " + resta);
            }
        });

    }

    @Override
    public void onClick(View view) {
        TextView mensaje = (TextView) findViewById(R.id.Textmensaje);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int suma = n1 + n2;
        mensaje.setText("La Suma es:" + suma);

    }

    public void ModificarTexto(View view) {
        TextView mensaje = (TextView) findViewById(R.id.Textmensaje);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 * n2;
        mensaje.setText("El producto es :" + res);
    }


    public void Division(View view) {
        TextView mensaje = (TextView) findViewById(R.id.Textmensaje);
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int res = n1 / n2;
        mensaje.setText("La división es :" + res);
    }
}