package com.example.book_store1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ManagementAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_admin);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Management & Business");
        }
    }
}