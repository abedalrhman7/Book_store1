package ReligiousBooksDetails;

import android.os.Bundle;

import com.example.book_store1.R;

public class ReligiousMessageDetailsActivity extends ReligiousBooksDetailsActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This Activity will always load the same template layout initially
        setContentView(R.layout.religious_message_details);

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
