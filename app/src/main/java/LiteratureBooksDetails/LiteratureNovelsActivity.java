package LiteratureBooksDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;

import SportBooksDetails.SportActivity;
import SportBooksDetails.SportBallGeneralsDetailsActivity;

// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class LiteratureNovelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_novels);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Literature");
        }
        ImageView Literature1Image = findViewById(R.id.imageViewNovelsFrankenstein);
        ImageView Literature2Image = findViewById(R.id.imageViewNovelsLozCase);
        ImageView Literature3Image = findViewById(R.id.imageViewNovelsIWillNeverForget);
        ImageView Literature4Image = findViewById(R.id.imageViewNovelsWinterOutsideMemory);


        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiteratureNovelsActivity.this, LiteratureFrankensteinDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiteratureNovelsActivity.this, LiteratureLozCaseDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiteratureNovelsActivity.this, LiteratureIwillNeverForgetDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LiteratureNovelsActivity.this, LiteratureWinterOutsideMemoryDetailsActivity.class);
                startActivity(intent);
            }
        };

        if (Literature1Image != null) {
            Literature1Image.setOnClickListener(commonBookClickListener);
        }

        if (Literature2Image != null) {
            Literature2Image.setOnClickListener(commonBook1ClickListener);
        }

        if (Literature3Image != null) {
            Literature3Image.setOnClickListener(commonBook2ClickListener);
        }

        if (Literature4Image != null) {
            Literature4Image.setOnClickListener(commonBook3ClickListener);
        }
    }
}