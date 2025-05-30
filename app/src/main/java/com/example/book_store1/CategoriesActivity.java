package com.example.book_store1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import ManagementBooksDetails.ManagementAdminActivity;
import MentalBooksDetails.MentalHealthActivity;
import ReligiousBooksDetails.ReligiousStudiesActivity;
import SelfDevelopmentBooksDetails.SelfDevelopmentActivity;
import SportBooksDetails.SportActivity;
import android.widget.Button;


public class CategoriesActivity extends AppCompatActivity {
    Button buttonLogin, buttonRegister;

    String[] categories = {
            "Management and Business Administration", "Literature and Novels", "History and Politics", "Self development", "Religious Studies",
            "Sport", "Mental health", "Health and Diet"
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        listView = findViewById(R.id.listViewCategories);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                categories
        );

        listView.setAdapter(adapter);

        buttonLogin = findViewById(R.id.button9);
        buttonRegister = findViewById(R.id.button6);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(CategoriesActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(CategoriesActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCategory = categories[position];

                if (selectedCategory.equals("Management and Business Administration")) {
                    Intent intent = new Intent(CategoriesActivity.this, ManagementAdminActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Literature and Novels")) {
                    Intent intent = new Intent(CategoriesActivity.this, LiteratureNovelsActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("History and Politics")) {
                    Intent intent = new Intent(CategoriesActivity.this, HistoryPoliticsActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Self development")) {
                    Intent intent = new Intent(CategoriesActivity.this, SelfDevelopmentActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Religious Studies")) {
                    Intent intent = new Intent(CategoriesActivity.this, ReligiousStudiesActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Sport")) {
                    Intent intent = new Intent(CategoriesActivity.this, SportActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Mental health")) {
                    Intent intent = new Intent(CategoriesActivity.this, MentalHealthActivity.class);
                    startActivity(intent);
                } else if (selectedCategory.equals("Health and Diet")) { // <-- ADD THIS BLOCK
                    Toast.makeText(CategoriesActivity.this, selectedCategory + " coming soon!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CategoriesActivity.this, HealthDietActivity.class);
                    startActivity(intent);

                }


                else {
                    Toast.makeText(CategoriesActivity.this, "Details for " + selectedCategory + " coming soon!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}