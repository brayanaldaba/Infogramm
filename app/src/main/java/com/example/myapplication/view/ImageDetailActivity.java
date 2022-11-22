package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;

public class ImageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);
        showtoolBar(titulo: "", botonSubir: true);
    }
    public void shoetoolBar(String titulo, boolean botonSubir){
        Toolbar toolbar = findViewById(R.id.toolbar_image_detail);
        setSupportActionBar(toolbar);
        getSuportActioinBar().setTitle(titulo);
        getSuportActiojnBar().setDisplayHomeAsUpEnabled(botonSubir);
    }
}