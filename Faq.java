package com.example.pawsfur;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {

    TextView faqQuestion1, faqAnswer1, faqQuestion2, faqAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);

        // Initialize views
        faqQuestion1 = findViewById(R.id.faqQuestion1);
        faqAnswer1 = findViewById(R.id.faqAnswer1);

        // Sample FAQ content
        faqQuestion1.setText("Q1: How do I book a service?");
        faqAnswer1.setText("A1: You can book a service by visiting the booking page.");

    }
}
