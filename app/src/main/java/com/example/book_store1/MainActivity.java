package com.example.book_store1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_card_book);
        ImageButton points3Button = findViewById(R.id.Points3);
        ImageButton points2Button = findViewById(R.id.Points2);

        points3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookLatestActivity.class);

                startActivity(intent);
                Toast.makeText(MainActivity.this, "ImageButton clicked!", Toast.LENGTH_SHORT).show();
            }
            });

        points2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookTrendingActivity.class);

                startActivity(intent);
                Toast.makeText(MainActivity.this, "ImageButton clicked!", Toast.LENGTH_SHORT).show();
            }
        });
        }

}