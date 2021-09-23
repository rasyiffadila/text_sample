package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void table(View view) {
        Intent Table= new Intent(MainActivity.this, Table.class);
        startActivity(Table);
    }
    public void relatif(View view) {
        Intent relatif= new Intent(MainActivity.this, relatif.class);
        startActivity(relatif);
    }
}
