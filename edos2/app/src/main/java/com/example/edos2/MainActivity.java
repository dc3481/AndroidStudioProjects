package com.example.edos2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mostrar onCreate
        Toast.makeText(this,  "onCreate", Toast.LENGTH_LONG).show();

        // Inicializar vistas
        EditText editTextName = findViewById(R.id.editTextName);
        Button buttonWelcome = findViewById(R.id.buttonWelcome);
        Button buttonExit = findViewById(R.id.buttonExit);

        // Acción del botón "Mostrar Bienvenida"
        buttonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                if (!name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bienvenido " + name, Toast.LENGTH_LONG).show();
                    // Hacer visible el botón "Salir"
                    buttonExit.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingrese su nombre", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Acción del botón "Salir"
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual y destruye la app
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
}