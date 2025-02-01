package com.example.myapplicationgym;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class IniciarSesion extends AppCompatActivity {

     private static List<Persona> personas = Registro.getPersonas();
     public static Persona persona;


 private Button volver,iniciarSesion;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.iniciar_sesion);
        EditText usuario = findViewById(R.id.editTextUsuario);
        EditText contrasena = findViewById(R.id.editTextTextPassword);

        volver = findViewById(R.id.volver);
        iniciarSesion = findViewById(R.id.btnIniciar);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < Registro.getPersonas().size(); i++) {

                    if (usuario.getText().toString().equalsIgnoreCase(Registro.getPersonas().get(i).getUsuario()) ){

                        if (contrasena.getText().toString().equals(Registro.getPersonas().get(i).getContrasena())){

                                Toast.makeText(IniciarSesion.this, "INICIO DE SESION CORRECTO", Toast.LENGTH_SHORT).show();
                                persona = personas.get(i);
                                Intent intent = new Intent(IniciarSesion.this,Gimnasio.class);
                                startActivity(intent);
                        }

                    }

                }


                //Intent intent = new Intent(IniciarSesion.this,MainActivity.class);
                //startActivity(intent);
            }
        });


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IniciarSesion.this,MainActivity.class);
                startActivity(intent);

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.iniciarS), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static List<Persona> getPersonas() {
        return personas;
    }
}
