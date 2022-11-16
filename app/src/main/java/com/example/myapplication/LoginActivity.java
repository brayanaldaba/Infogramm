package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.view.ContainerActivity;
import com.example.myapplication.view.CreateAccountActivity;

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

    public void login(View view) {
        Intent intent = Intent( PackageContext: this, ContainerActivity.class);
        startActivity(intent);
    }
}