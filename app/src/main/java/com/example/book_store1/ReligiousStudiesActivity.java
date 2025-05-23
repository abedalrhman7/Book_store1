package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class ReligiousStudiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_studies);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Religious Studies");
        }

        // Optional: Set up click listener for the button
        // Button exploreButton = findViewById(R.id.btnExploreSacredTexts);
        // if (exploreButton != null) {
        //     exploreButton.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //         public void onClick(View v) {
        //             Toast.makeText(ReligiousStudiesActivity.this, "Exploring sacred texts...", Toast.LENGTH_SHORT).show();
        //             // Implement further logic
        //         }
        //     });
        // }
    }
}