package LiteratureBooksDetails;

import android.os.Bundle;

import com.example.book_store1.R;

public class LiteratureWinterOutsideMemoryDetailsActivity extends LiteratureNovelsBooksDetailsActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.literature_winter_outside_memory_details);

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
