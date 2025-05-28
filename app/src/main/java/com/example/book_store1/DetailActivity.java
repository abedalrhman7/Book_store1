package com.example.book_store1;

import static android.content.Intent.getIntent;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get layout name from intent
        String layoutName = getIntent().getStringExtra("layoutName");


        @SuppressLint("DiscouragedApi") int layoutId = getResources().getIdentifier(layoutName, "layout", getPackageName());

        // Set the layout
        if (layoutId != 0) {
            setContentView(layoutId);
        } else {
            setContentView(R.layout.activity_categories); // fallback
        }

        // Enable action bar back arrow (optional if you're using the system action bar)
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Back arrow ImageView inside the layout
        ImageView backArrow = findViewById(R.id.backArrow);
        if (backArrow != null) {
            backArrow.setOnClickListener(v -> finish()); // Go back to MainActivity
        }
    }

    // Handle action bar back press
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
