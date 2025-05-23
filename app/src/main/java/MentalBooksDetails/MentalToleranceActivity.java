package MentalBooksDetails;

import android.os.Bundle;

import com.example.book_store1.R;


public class MentalToleranceActivity extends MentalBooksDetailsActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mental_tolerance_details);

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