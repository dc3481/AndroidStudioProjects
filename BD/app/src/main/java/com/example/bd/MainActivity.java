package com.example.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bd.base.DbHelper;

public class MainActivity extends AppCompatActivity {

    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCrear = findViewById(R.id.btnCrear);
         btnCrear.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 DbHelper dbHelper = new DbHelper(MainActivity.this);
                 SQLiteDatabase base = dbHelper.getWritableDatabase();
                 if ( base != null)
                 {
                     Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     Toast.makeText(MainActivity.this, "ERROR AL CREAR LA BASE TONTO", Toast.LENGTH_SHORT).show();
                 }
             }
         });
    }
}