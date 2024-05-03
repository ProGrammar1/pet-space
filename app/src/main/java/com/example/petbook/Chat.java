package com.example.petbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.button_Chat);

        bottomNavigationView.setOnItemSelectedListener(item ->
        {
            if (item.getItemId() == R.id.buttom_home) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
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

                return true;
            }

            return false;
        });
    }
}