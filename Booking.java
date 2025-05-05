package com.example.pawsfur;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Booking extends AppCompatActivity {

    EditText bookingName, bookingEmail, bookingContact, bookingDate, bookingTime, bookingService;
    Button submitBookingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);

        // Initialize views
        bookingName = findViewById(R.id.bookingName);
        bookingEmail = findViewById(R.id.bookingEmail);
        bookingContact = findViewById(R.id.bookingContact);
        bookingDate = findViewById(R.id.bookingDate);
        bookingTime = findViewById(R.id.bookingTime);
        bookingService = findViewById(R.id.bookingService);
        submitBookingButton = findViewById(R.id.submitBookingButton);

        // Submit Booking button click listener
        submitBookingButton.setOnClickListener(v -> {
            String name = bookingName.getText().toString();
            String email = bookingEmail.getText().toString();
            String contact = bookingContact.getText().toString();
            String date = bookingDate.getText().toString();
            String time = bookingTime.getText().toString();
            String service = bookingService.getText().toString();

            // Basic validation
            if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || date.isEmpty() || time.isEmpty() || service.isEmpty()) {
                Toast.makeText(Booking.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Simulate booking success
                Toast.makeText(Booking.this, "Booking Successful", Toast.LENGTH_SHORT).show();
                // You can add functionality here to save the booking details, for example:
                // Save to database or Firebase
            }
        });
    }
}
