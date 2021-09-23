package com.example.layoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class relatif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatif);
    }
    public void relatif1(View view) {
        Intent Comment= new Intent(relatif.this, Comment.class);
        startActivity(Comment);
    }
    public void relatif2(View view){
        Intent Purchase = new Intent(relatif.this, Purchase.class);
        startActivity(Purchase);
    }
}
