package com.example.todorecetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText usernameEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rodigro
        boton = findViewById(R.id.button1);
        usernameEdit = findViewById(R.id.usernameEdit);

        //listener para el boton, despues de presionarlo las siguientes operaciones ocurriran
        boton.setOnClickListener(v ->{
            //obtener valor del input y transformarlo a string
            String str = usernameEdit.getText().toString();
            //Crear el Intent
            Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
            //
            intent.putExtra("mensaje",str);
            //iniciar el intent
            startActivity(intent);
        });

    }
}