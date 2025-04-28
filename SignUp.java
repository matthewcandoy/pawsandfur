package com.example.pawsfur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    Button signUpSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        signUpSubmitButton = findViewById(R.id.signUpButton);

        signUpSubmitButton.setOnClickListener(v -> {
            // Here, normally you'd save user details
            // After successful signup:
            Intent intent = new Intent(SignUp.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
