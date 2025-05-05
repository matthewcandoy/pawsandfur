package com.example.pawsfur;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    ImageButton bookNowButton, galleryButton, faqButton, pawBotButton, aboutUsButton, profileButton,logoutButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        // Initialize buttons
        bookNowButton = findViewById(R.id.bookNow);
        galleryButton = findViewById(R.id.gallery);
        faqButton = findViewById(R.id.faq);
        pawBotButton = findViewById(R.id.pawBot);
        aboutUsButton = findViewById(R.id.aboutUs);
        profileButton = findViewById(R.id.btnProfile);
        logoutButton = findViewById(R.id.btnLogout);

        // Set up onClick listeners for the image buttons
        bookNowButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Booking.class));
        });

        galleryButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Gallery.class));
        });

        faqButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Faq.class));
        });

        pawBotButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, PawBot.class));
        });

        aboutUsButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, AboutUs.class));
        });

        // Profile button click listener
        profileButton.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Profile.class));
        });

        // Logout button click listener
        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, Login.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish(); // Log out and return to SignInActivity
        });
    }
}
