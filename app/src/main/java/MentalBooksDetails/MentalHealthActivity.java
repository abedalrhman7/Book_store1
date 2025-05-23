package MentalBooksDetails; // Ensure this matches your package name

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import com.example.book_store1.R;


public class MentalHealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Mental Health");
        }
        ImageView book1Image = findViewById(R.id.imageViewMentalTolerance);
        ImageView book2Image = findViewById(R.id.imageViewMentalSatan);
        ImageView book3Image = findViewById(R.id.imageViewMentalBeHappy);
        ImageView book4Image = findViewById(R.id.imageViewMentalGuardian);

        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MentalHealthActivity.this, MentalToleranceActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MentalHealthActivity.this, MentalSatanActivity.class);
                startActivity(intent);
            }
        };


        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MentalHealthActivity.this, MentalBeHappyActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MentalHealthActivity.this, MentalGuardianActivity.class);
                startActivity(intent);
            }
        };

        if (book1Image != null) {
            book1Image.setOnClickListener(commonBookClickListener);
        }
        if (book2Image != null) {
            book2Image.setOnClickListener(commonBook1ClickListener);
        }
        if (book3Image != null) {
            book3Image.setOnClickListener(commonBook2ClickListener);
        }
        if (book4Image != null) {
            book4Image.setOnClickListener(commonBook3ClickListener);
        }
    }
}