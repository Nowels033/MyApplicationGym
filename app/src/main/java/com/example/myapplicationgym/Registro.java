package com.example.myapplicationgym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class Registro extends MainActivity {

    public static List<Persona> personas = new java.util.ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.registro);



        Button volver = findViewById(R.id.volver2);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registro.this,MainActivity.class);
                startActivity(intent);

            }
        });
        EditText usuario = findViewById(R.id.etUsuario);
        EditText nombre = findViewById(R.id.etNombre);
       // EditText apellido = findViewById(R.id.etApellido);
        EditText contrasena = findViewById(R.id.etContrasenia);
        EditText correo = findViewById(R.id.etCorreo);
        EditText altura = findViewById(R.id.etAltura);
        EditText peso = findViewById(R.id.etPeso);

        Button btnRegistrarse = findViewById(R.id.btnCrearCuenta);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                crearCuenta(v,usuario,nombre,contrasena,correo,altura,peso);

                Intent intent = new Intent(Registro.this,MainActivity.class);
                startActivity(intent);

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.registro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void crearCuenta(View view,EditText usuario,EditText nombre,EditText contrasena,EditText correo,EditText altura,EditText peso){

        if (usuario.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese un nombre de usuario", Toast.LENGTH_SHORT).show();
            return;
        }
        if (nombre.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese un nombre", Toast.LENGTH_SHORT).show();
            return;
        }
        if (contrasena.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese una contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        if (correo.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese un correo", Toast.LENGTH_SHORT).show();
            return;
        }
        if (altura.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese una altura", Toast.LENGTH_SHORT).show();
            return;
        }
        if (peso.getText().toString().isEmpty()) {
            Toast.makeText(this, "Por favor ingrese un peso", Toast.LENGTH_SHORT).show();
            return;
        }
        Persona newPersona = new Persona(usuario.getText().toString(),nombre.getText().toString(),null,correo.getText().toString(),Double.parseDouble(peso.getText().toString()),Double.parseDouble(altura.getText().toString()));
        personas.add(newPersona);

    }
}

