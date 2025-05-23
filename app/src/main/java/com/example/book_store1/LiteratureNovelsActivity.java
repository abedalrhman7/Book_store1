package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class LiteratureNovelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_novels);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Literature & Novels");
        }

        // If you added a button with an ID like btnViewMoreLiterature, you can set up its click listener here
        // Button viewMoreButton = findViewById(R.id.btnViewMoreLiterature);
        // if (viewMoreButton != null) {
        //     viewMoreButton.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //         public void onClick(View v) {
        //             Toast.makeText(LiteratureNovelsActivity.this, "Loading more novels...", Toast.LENGTH_SHORT).show();
        //             // Implement logic to load more or go to another screen
        //         }
        //     });
        // }
    }
}