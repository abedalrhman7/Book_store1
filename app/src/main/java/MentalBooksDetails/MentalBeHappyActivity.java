package MentalBooksDetails;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.book_store1.DataManager;
import com.example.book_store1.R;

public class MentalBeHappyActivity extends MentalBooksDetailsActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mental_be_happy_details);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Book Detail");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageButton favButton = findViewById(R.id.imageButtonFavMentalBeHappy);
        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataManager db = new DataManager(MentalBeHappyActivity.this);
                String title = "Be Happy";
                String description = "Imagine possessing the priceless antidote. Imagine seeing a part of paradise, a part that only private people reach. Happiness is the reward of a long journey that encapsulates your entire life and the lives of others who have succeeded in possessing that secret. The vast majority of people don't know a path to happiness, but the elixir of happiness is the great ray of the universe.... Your inner light. Life in its optimal dress. Happiness is a disease, an infection and a medicine. If happiness is a disease, let the disease of happiness spread now among the world. If it becomes a medicine, let's spread the antidote to happiness in the world.";
                String imageResource = "be_happy"; // Drawable name without extension

                db.addFavorite(title, description, imageResource);
                Toast.makeText(MentalBeHappyActivity.this, "Added to Favorites", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
