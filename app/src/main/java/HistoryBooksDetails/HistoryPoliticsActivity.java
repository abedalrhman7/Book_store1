package HistoryBooksDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;

import SportBooksDetails.SportActivity;
import SportBooksDetails.SportBallGeneralsDetailsActivity;

public class HistoryPoliticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_politics);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("History");
        }
        ImageView History1Image = findViewById(R.id.imageViewHistoryPortSaid);
        ImageView History2Image = findViewById(R.id.imageViewHistoryArabNazis);
        ImageView History3Image = findViewById(R.id.imageViewHistorySpanishColonists);



        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryPoliticsActivity.this, HistoryPortSaidDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryPoliticsActivity.this, HistoryArabNazisDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryPoliticsActivity.this, HistorySpanishColonistsDetails.class);
                startActivity(intent);
            }
        };
        if (History1Image != null) {
            History1Image.setOnClickListener(commonBookClickListener);
        }

        if (History2Image != null) {
            History2Image.setOnClickListener(commonBook1ClickListener);
        }


        if (History3Image != null) {
        History3Image.setOnClickListener(commonBook2ClickListener);
    }


    }}
