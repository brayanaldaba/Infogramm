package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_vavigation_view);
        bottomNavigationView.sestOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener(){
                    @Override
                     public  boolean onNavigationItemSelect(@NonNull MenuItem item){
                        Fragment selectedFragment =null;
                        switch (item.getItemId()){
                            case R.id.search:
                                selectedFragment = new SearchFragment();
                                break;
                            case R.id.home:
                                selectedFragment = new HomeFragment();
                                break;
                            case R.id.profile:
                                selectedFragment = new ProfileFragment();
                                break;

                        }
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container_frame)
                                .commit();

                        return true;
                    }
                }
        );
    }
}