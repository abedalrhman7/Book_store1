package com.example.book_store1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookDetailActivity extends AppCompatActivity {

    private DataManager dbManager;
    private String title, description, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_detail_template); // One reusable layout

        dbManager = new DataManager(this);

        title = getIntent().getStringExtra("title");
        description = getIntent().getStringExtra("description");
        image = getIntent().getStringExtra("image");

        TextView titleView = findViewById(R.id.textViewTitle);
        TextView descView = findViewById(R.id.textViewDescription);
        ImageView imgView = findViewById(R.id.imageViewBook);
        ImageButton favButton = findViewById(R.id.buttonFavorite);

        titleView.setText(title);
        descView.setText(description);
        int imageResId = getResources().getIdentifier(image, "drawable", getPackageName());
        imgView.setImageResource(imageResId);

        favButton.setOnClickListener(v -> {
            dbManager.addFavorite(title, description, image);
            Toast.makeText(this, "Added to favorites", Toast.LENGTH_SHORT).show();
        });
    }
}
