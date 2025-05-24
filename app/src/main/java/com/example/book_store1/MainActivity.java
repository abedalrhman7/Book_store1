package com.example.book_store1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.main_card_book);
        ImageButton points3Button = findViewById(R.id.Points4);
        ImageButton points2Button = findViewById(R.id.Points2);
        ImageButton pointsBestButton = findViewById(R.id.pointsBest);
        ImageButton categoriesButton = findViewById(R.id.Categories);

        categoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start CategoriesActivity
                Intent intent = new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(intent);
            }
        });



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
        pointsBestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardBookBestSellingPrice.class);

                startActivity(intent);
                Toast.makeText(MainActivity.this, "ImageButton clicked!", Toast.LENGTH_SHORT).show();
            }
        });



}


}