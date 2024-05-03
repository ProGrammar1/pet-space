package com.example.petbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Donations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.button_donation);

        bottomNavigationView.setOnItemSelectedListener(item ->
        {
            if (item.getItemId() == R.id.buttom_home) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
                return true;
            } else if (item.getItemId() == R.id.button_donation) {

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