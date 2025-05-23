package MentalBooksDetails; // Your package

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;

public class MentalBooksDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mental_books_details);

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



