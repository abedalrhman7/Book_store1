package SportBooksDetails; // Ensure this matches your package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;



public class SportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Sport");
        }
        ImageView Sport1Image = findViewById(R.id.imageViewSportBallGenerals);
        ImageView Sport2Image = findViewById(R.id.imageViewSportFootballWars);
        ImageView Sport3Image = findViewById(R.id.imageViewSportShikabalaRebel);
        ImageView SportImage = findViewById(R.id.imageViewSportLiverpoolCity);


        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportActivity.this, SportBallGeneralsDetailsActivity.class);
                startActivity(intent);
            }
        };


        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportActivity.this, SportFootballWarsDetailsActivity.class);
                startActivity(intent);
            }
        };
/*
        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportActivity.this, MentalGuardianActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportActivity.this, MentalGuardianActivity.class);
                startActivity(intent);
            }
        };
*/
        if (Sport1Image != null) {
            Sport1Image.setOnClickListener(commonBookClickListener);
       }
        if (Sport2Image != null) {
            Sport2Image.setOnClickListener(commonBook1ClickListener);
       /*
        }
        if (Sport3Image != null) {
            SportImage.setOnClickListener(commonBook2ClickListener);
        }
        if (Sport4Image != null) {
            Sport4Image.setOnClickListener(commonBook3ClickListener);
        }*/
        }
    }}