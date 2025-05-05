package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);  // Make sure this matches the XML layout

        // Initialize views
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        // Login button click listener
        loginButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Basic validation
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(Login.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
            } else {
                // Simulating login success
                // You can replace this with actual login logic (e.g., Firebase authentication)
                if (username.equals("test") && password.equals("password")) {  // Example credentials for testing
                    // Login success, proceed to DashboardActivity
                    Intent intent = new Intent(Login.this, Dashboard.class);
                    startActivity(intent);  // Start the DashboardActivity
                    finish();  // Close the LoginActivity so the user cannot go back to it
                } else {
                    // Login failure, show a toast message
                    Toast.makeText(Login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
