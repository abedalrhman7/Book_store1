package ReligiousBooksDetails;

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

public class ReligiousStudiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_studies);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Religious Studies");
        }

        ImageView Religious1Image = findViewById(R.id.imageViewReligiousAMaessageFromGod);
        ImageView Sport2Image = findViewById(R.id.imageViewSportFootballWars);
        ImageView Sport3Image = findViewById(R.id.imageViewSportShikabalaRebel);
        ImageView Sport4Image = findViewById(R.id.imageViewSportLiverpoolCity);


        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousStudiesActivity.this, ReligiousMessageDetailsActivity.class);
                startActivity(intent);
            }
        };
        if (Religious1Image != null) {
            Religious1Image.setOnClickListener(commonBookClickListener);
        }

    }
}