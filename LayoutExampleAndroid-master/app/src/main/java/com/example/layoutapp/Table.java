package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }
    public void table1(View view) {
        Intent tablerow= new Intent(Table.this, tabelrow.class);
        startActivity(tablerow);
    }
    public void table2(View view){
        Intent login = new Intent(Table.this, login.class);
        startActivity(login);
    }
}
