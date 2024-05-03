package com.example.petbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {
    EditText signup_email,name,username,password,address;
    TextView signin_redirect;
    ImageButton signup;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        setContentView(R.layout.activity_signup);

        signup_email = findViewById(R.id.email);
        name = findViewById(R.id.name);

        username = findViewById(R.id.username);

        password = findViewById(R.id.password);

        address = findViewById(R.id.address);
        signup = findViewById(R.id.signuobtn);
        signin_redirect = findViewById(R.id.signin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
            databaseReference = database.getReference(data);

            String email = signup_email.getText().toString();
            String signup_name = name.getText().toString();

                String signup_username = username.getText().toString();

                String signup_pass = password.getText().toString();

                String signup_address = address.getText().toString();

                helperclass helperclass = new helperclass(signup_username,email,signup_pass,signup_address,signup_name);
                databaseReference.child(signup_name).setValue(helperclass);

                Toast.makeText(com.example.petbook.signup.this, "Sign Up Successful", Toast.LENGTH_SHORT);

                Intent intent = new Intent(signup.this, login_acc.class);
                intent.putExtra("name", data);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



            }
        });
        signin_redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), login_acc.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });

    }
}