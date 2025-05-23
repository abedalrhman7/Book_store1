package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class HealthDietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_diet);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Health & Diet");
        }

        // Optional: Set up click listener for the button
        // Button recipeButton = findViewById(R.id.btnExploreRecipes);
        // if (recipeButton != null) {
        //     recipeButton.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //         public void onClick(View v) {
        //             Toast.makeText(HealthDietActivity.this, "Loading healthy recipes...", Toast.LENGTH_SHORT).show();
        //             // Implement further logic
        //         }
        //     });
        // }
    }
}