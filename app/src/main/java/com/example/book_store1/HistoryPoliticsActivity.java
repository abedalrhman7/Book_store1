package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class HistoryPoliticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_politics);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("History & Politics");
        }

        // Optional: Set up click listener for the button if you added one with an ID
        // Button viewMoreButton = findViewById(R.id.btnViewMoreHistory);
        // if (viewMoreButton != null) {
        //     viewMoreButton.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //         public void onClick(View v) {
        //             Toast.makeText(HistoryPoliticsActivity.this, "Exploring more history...", Toast.LENGTH_SHORT).show();
        //             // Implement logic here
        //         }
        //     });
        // }
    }
}