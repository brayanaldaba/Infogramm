package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        shoetoolBar(getString(R.string.title_crear_cuenta), true);
    }
    public void shoetoolBar(String titulo, boolean botonSubir){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSuportActioinBar().setTitle(titulo);
        getSuportActiojnBar().setDisplayHomeAsUpEnabled(botonSubir);
}
}