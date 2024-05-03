package com.example.petbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.buttom_home);


        bottomNavigationView.setOnItemSelectedListener(item ->
        {
            if (item.getItemId() == R.id.buttom_home) {
                return true;
            } else if (item.getItemId() == R.id.button_donation) {
                startActivity(new Intent(getApplicationContext(), Donations.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                return true;
            }

            else if (item.getItemId() == R.id.button_lnf) {
                startActivity(new Intent(getApplicationContext(), Lost_and_found.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                return true;
            }

            else if (item.getItemId() == R.id.button_Chat) {
                startActivity(new Intent(getApplicationContext(), Chat.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                return true;
            }

            return false;
        });
    }
}