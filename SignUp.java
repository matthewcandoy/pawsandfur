package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    Button signUpButton;
    TextView signInLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        // Initialize views
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirmPassword);
        signUpButton = findViewById(R.id.signUpButton);
        signInLink = findViewById(R.id.signInLink);

        // Sign Up button click listener
        signUpButton.setOnClickListener(v -> {
            String username = usernameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String confirmPassword = confirmPasswordEditText.getText().toString();

            // Basic validation
            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(SignUp.this, "All fields are required", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(SignUp.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                // Simulating sign-up success
                // You can replace this with actual backend sign-up logic
                Toast.makeText(SignUp.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();

                // Redirect to LoginActivity
                Intent intent = new Intent(SignUp.this, Login.class);  // Make sure LoginActivity is correctly referenced
                startActivity(intent);
                finish();  // Close SignUpActivity after sign up
            }
        });

        // Redirect to Login page
        signInLink.setOnClickListener(v -> {
            startActivity(new Intent(SignUp.this, Login.class));
        });
    }
}
