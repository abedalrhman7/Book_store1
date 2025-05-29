package com.example.book_store1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import HistoryBooksDetails.HistoryPoliticsActivity;
import LiteratureBooksDetails.LiteratureNovelsActivity;
import ManagementBooksDetails.ManagementAdminActivity;
import MentalBooksDetails.MentalHealthActivity;
import ReligiousBooksDetails.ReligiousStudiesActivity;
import SelfDevelopmentBooksDetails.SelfDevelopmentActivity;
import SportBooksDetails.SportActivity;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        Toolbar toolbar = findViewById(R.id.bottom_toolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.open, R.string.close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.management) {
                startActivity(new Intent(MainActivity.this, ManagementAdminActivity.class));
            } else if (id == R.id.literature) {
                startActivity(new Intent(MainActivity.this, LiteratureNovelsActivity.class));
            } else if (id == R.id.login) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            } else if (id == R.id.registration) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            } else if (id == R.id.history) {
                startActivity(new Intent(MainActivity.this, HistoryPoliticsActivity.class));
            } else if (id == R.id.self_development) {
                startActivity(new Intent(MainActivity.this, SelfDevelopmentActivity.class));
            } else if (id == R.id.religious) {
                startActivity(new Intent(MainActivity.this, ReligiousStudiesActivity.class));
            } else if (id == R.id.sport) {
                startActivity(new Intent(MainActivity.this, SportActivity.class));
            } else if (id == R.id.mental_health) {
                startActivity(new Intent(MainActivity.this, MentalHealthActivity.class));
            } else if (id == R.id.health_dite) {
                startActivity(new Intent(MainActivity.this, HealthDietActivity.class));
            }
            drawerLayout.closeDrawers();
            return true;
        });

        ImageButton points3Button = findViewById(R.id.Points4);
        ImageButton points2Button = findViewById(R.id.Points2);
        ImageButton pointsBestButton = findViewById(R.id.pointsBest);
        ImageButton categoriesButton = findViewById(R.id.Categories);
        ImageButton homeButton = findViewById(R.id.home_button);
        ImageButton accountButton = findViewById(R.id.account_button);
        ImageButton wishlistButton = findViewById(R.id.wishlist_button);
        ImageButton cartButton = findViewById(R.id.cart_button);

        cartButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CartActivity.class);
            startActivity(intent);
        });

        accountButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        categoriesButton.setOnClickListener(v -> {
            drawerLayout.openDrawer(GravityCompat.START);
        });

        points3Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CardBookLatestActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Latest clicked!", Toast.LENGTH_SHORT).show();
        });

        points2Button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CardBookTrendingActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Trending clicked!", Toast.LENGTH_SHORT).show();
        });

        pointsBestButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CardBookBestSellingPrice.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Best Seller clicked!", Toast.LENGTH_SHORT).show();
        });

        navigationView.post(() -> {
            View loginView = navigationView.findViewById(R.id.login);
            View registerView = navigationView.findViewById(R.id.registration);

            if (loginView != null) {
                loginView.setBackgroundResource(R.drawable.nav_item_auth_background);
            }

            if (registerView != null) {
                registerView.setBackgroundResource(R.drawable.nav_item_auth_background);
            }
        });

        Button openDetailButton = findViewById(R.id.openBookDetail);
        openDetailButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BookDetailActivity.class);
            intent.putExtra("title", "Guardian OF The Sky");
            intent.putExtra("description", "We all have a voice inside us...");
            intent.putExtra("image", "guardian_of_the_sky");
            startActivity(intent);
        });
    }
}
