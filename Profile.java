package com.example.pawsfur;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    EditText usernameEditText, emailEditText, passwordEditText;
    Button saveButton, cancelButton;
    TextView profileTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // Initialize views
        profileTitle = findViewById(R.id.profileTitle);
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        saveButton = findViewById(R.id.saveButton);
        cancelButton = findViewById(R.id.cancelButton);

        // Assume we get the user data from a database or shared preferences (for demonstration)
        String username = "testuser"; // Example data
        String email = "testuser@example.com"; // Example data

        // Set existing user data in the EditTexts
        usernameEditText.setText(username);
        emailEditText.setText(email);

        // Save button listener
        saveButton.setOnClickListener(v -> {
            String updatedUsername = usernameEditText.getText().toString();
            String updatedEmail = emailEditText.getText().toString();
            String updatedPassword = passwordEditText.getText().toString();

            // Perform validation
            if (updatedUsername.isEmpty() || updatedEmail.isEmpty() || updatedPassword.isEmpty()) {
                Toast.makeText(Profile.this, "All fields must be filled", Toast.LENGTH_SHORT).show();
            } else {
                // For demonstration, we just show a success message
                Toast.makeText(Profile.this, "Profile Updated Successfully", Toast.LENGTH_SHORT).show();
                // You can add functionality here to save the changes to a database or backend service
            }
        });

        // Cancel button listener (go back to Dashboard or previous screen)
        cancelButton.setOnClickListener(v -> {
            finish();  // Close the ProfileActivity and return to the previous activity
        });
    }
}
