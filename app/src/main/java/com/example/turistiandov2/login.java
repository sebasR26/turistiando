package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class login extends AppCompatActivity {

    //atributos
EditText cajaNonbreusuario;
EditText cajaContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNonbreusuario = findViewById(R.id.usuario);
        cajaContrasena = findViewById(R.id.contrasena);

        //capturando datos de las cajas(editText)

        String nombreUsuario = cajaNonbreusuario.getText().toString();
        String contrasena = cajaContrasena.getText().toString();

    }
}