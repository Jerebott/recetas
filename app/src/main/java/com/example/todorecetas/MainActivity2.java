package com.example.todorecetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 //rodigro
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);
        // get intent
        Intent intent = getIntent();
        //recibir el valor mediante getStringExtra(), la llave debe ser la misma
        String str = intent.getStringExtra("mensaje");
        //mostrar en textView
        textView.setText("Bienvenido: "+str);
    }
}