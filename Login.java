package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button loginSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        loginSubmitButton = findViewById(R.id.loginButton);

        loginSubmitButton.setOnClickListener(v -> {
            // Here, you'd normally check user credentials
            // After successful login:
            Intent intent = new Intent(Login.this, Dashboard.class);
            startActivity(intent);
            finish();
        });
    }
}

