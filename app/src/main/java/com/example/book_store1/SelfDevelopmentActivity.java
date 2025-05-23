package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class SelfDevelopmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_development);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Self Development");
        }

        // Optional: Set up click listener for the button if you added one with an ID
        // Button exploreButton = findViewById(R.id.btnExploreMindfulness);
        // if (exploreButton != null) {
        //     exploreButton.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //         public void onClick(View v) {
        //             Toast.makeText(SelfDevelopmentActivity.this, "Learning about mindfulness...", Toast.LENGTH_SHORT).show();
        //             // Implement logic here
        //         }
        //     });
        // }
    }
}