package com.example.book_store1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_card_book); // Update this to R.layout.main_activity if your layout file is named that way

        // Image buttons already implemented
        ImageButton points3Button = findViewById(R.id.Points4);
        ImageButton points2Button = findViewById(R.id.Points2);
        ImageButton pointsBestButton = findViewById(R.id.pointsBest);
        ImageButton categoriesButton = findViewById(R.id.Categories);

        // NEW: Login and Register buttons
        loginButton = findViewById(R.id.button4);
        registerButton = findViewById(R.id.button5);

        // Login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        // Register button click
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        // Categories image button
        categoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(intent);
            }
        });

        // Points buttons (Latest, Trending, Best Price)
        points3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookLatestActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Latest clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        points2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookTrendingActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Trending clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        pointsBestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookBestSellingPrice.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Best Selling clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
