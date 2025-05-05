package com.example.pawsfur;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    TextView aboutUsText;
    Button contactUsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        // Initialize views
        aboutUsText = findViewById(R.id.aboutUsDescription);
        contactUsButton = findViewById(R.id.contactUsButton);

        // Set information about the app or business
        aboutUsText.setText("We are a pet care service offering grooming, training, and health services for pets.");

        // Contact Us button click listener
        contactUsButton.setOnClickListener(v -> {
            // You can implement contact functionality here, e.g., send an email or open a contact form
            Toast.makeText(AboutUs.this, "Contact Us clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
