
package com.example.book_store1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {


    String[] categories = {
            "Fiction", "Science", "History", "Biography", "Fantasy",
            "Mystery", "Technology", "Self-Help", "Children's Books"
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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCategory = categories[position];
                Toast.makeText(CategoriesActivity.this, "Clicked: " + selectedCategory, Toast.LENGTH_SHORT).show();
                // Later, you can navigate to another activity based on the selectedCategory
            }
        });
    }
}