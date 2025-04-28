package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    ImageView bookNow, gallery, faq, aboutUs;
    Button pawBotButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        bookNow = findViewById(R.id.bookingImage);
        gallery = findViewById(R.id.galleryImage);
        faq = findViewById(R.id.faqImage);
        aboutUs = findViewById(R.id.aboutUsImage);
        pawBotButton = findViewById(R.id.pawBotButton);
        logoutButton = findViewById(R.id.logoutButton);

        bookNow.setOnClickListener(v -> startActivity(new Intent(Dashboard.this, Booking.class)));
        gallery.setOnClickListener(v -> startActivity(new Intent(Dashboard.this, Gallery.class)));
        faq.setOnClickListener(v -> startActivity(new Intent(Dashboard.this, Faq.class)));
        aboutUs.setOnClickListener(v -> startActivity(new Intent(Dashboard.this, AboutUs.class)));
        pawBotButton.setOnClickListener(v -> startActivity(new Intent(Dashboard.this, PawBot.class)));

        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
