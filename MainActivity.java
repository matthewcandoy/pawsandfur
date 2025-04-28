package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button logInButton, signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Your main activity layout

        logInButton = findViewById(R.id.logInButton);
        signUpButton = findViewById(R.id.signUpButton);

        logInButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Login.class));
        });

        signUpButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SignUp.class));
        });
    }
}
