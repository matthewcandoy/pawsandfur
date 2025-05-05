package com.example.pawsfur;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Gallery extends AppCompatActivity {

    ImageButton galleryImage1, galleryImage2, galleryImage3, galleryImage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        // Initialize views
        galleryImage1 = findViewById(R.id.galleryImage1);
        galleryImage2 = findViewById(R.id.galleryImage2);
        galleryImage3 = findViewById(R.id.galleryImage3);
        galleryImage4 = findViewById(R.id.galleryImage4);

        // Gallery image click listeners
        galleryImage1.setOnClickListener(v -> {
            // Handle image click (e.g., open larger image or show a detailed view)
        });

        galleryImage2.setOnClickListener(v -> {
            // Handle image click (e.g., open larger image or show a detailed view)
        });
    }
}
