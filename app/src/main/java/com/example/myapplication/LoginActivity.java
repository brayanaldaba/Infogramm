package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public  void goCreateAccount(View view){
        Intent intent = Intent( PackageContext: this, CreateAccountActivity.class);
        startActivity(intent);
    }
}