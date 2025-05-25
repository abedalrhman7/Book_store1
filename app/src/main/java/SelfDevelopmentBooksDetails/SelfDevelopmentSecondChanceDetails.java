package SelfDevelopmentBooksDetails;

import android.os.Bundle;

import com.example.book_store1.R;

public class SelfDevelopmentSecondChanceDetails extends SelfDevelopmentBooksDetails{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This Activity will always load the same template layout initially
        setContentView(R.layout.self_second_chance_details);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Book Detail"); // Generic title
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
