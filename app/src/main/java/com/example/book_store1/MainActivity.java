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

            // -------------------------
            // Drawer + Toolbar setup
            // -------------------------
            drawerLayout = findViewById(R.id.drawer_layout);
            navigationView = findViewById(R.id.nav_view);


            Toolbar toolbar = findViewById(R.id.bottom_toolbar); // Make sure toolbar ID matches
            setSupportActionBar(toolbar);

            toggle = new ActionBarDrawerToggle(
                    this, drawerLayout, toolbar,
                    R.string.open, R.string.close
            );
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            // Handle navigation drawer item clicks
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int id = item.getItemId();
                    if (id == R.id.management) {

                        Intent intent = new Intent(MainActivity.this, ManagementAdminActivity.class);
                        startActivity(intent);
                    } else if (id == R.id.literature) {
                        Intent intent = new Intent(MainActivity.this, LiteratureNovelsActivity.class);
                        startActivity(intent);
                    }

                 else if (id == R.id.login) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
                    else if (id == R.id.registration) {
                        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.history) {
                        Intent intent = new Intent(MainActivity.this, HistoryPoliticsActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.self_development) {
                        Intent intent = new Intent(MainActivity.this, SelfDevelopmentActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.religious) {
                        Intent intent = new Intent(MainActivity.this, ReligiousStudiesActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.sport) {
                        Intent intent = new Intent(MainActivity.this, SportActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.mental_health) {
                        Intent intent = new Intent(MainActivity.this, MentalHealthActivity.class);
                        startActivity(intent);
                    }

                    else if (id == R.id.health_dite) {
                        Intent intent = new Intent(MainActivity.this, HealthDietActivity.class);
                        startActivity(intent);
                    }
                    drawerLayout.closeDrawers();
                    return true;
                }
            });

            // -------------------------
            // Your original ImageButtons
            // -------------------------
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

            // Apply custom background to login and registration items
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
            cartButton.setOnClickListener(v -> {
                CartItem item = new CartItem(
                        "Be Happy",
                        "A book about finding joy.",
                        5.0,
                        "be_happy_cover" // Make sure this matches an image in your drawable folder (e.g., res/drawable/be_happy_cover.png)
                );
                // Example book


                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            });

        }
    }