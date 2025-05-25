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
        ImageView Religious2Image = findViewById(R.id.imageViewReligiousQuranicAnswer);
        ImageView Religious3Image = findViewById(R.id.imageViewReligiousGeniusOfMuhammad1);
        ImageView Religious4Image = findViewById(R.id.imageViewReligiousLosTreasure);


        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousStudiesActivity.this, ReligiousMessageDetailsActivity.class);
                startActivity(intent);
            }
        };
        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousStudiesActivity.this, ReligiousQuranicDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousStudiesActivity.this, ReligiousGeniusMuhammadDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligiousStudiesActivity.this, ReligiousTheLosTreasureDetailsActivity.class);
                startActivity(intent);
            }
        };
        if (Religious1Image != null) {
            Religious1Image.setOnClickListener(commonBookClickListener);
        }

        if (Religious2Image != null) {
            Religious2Image.setOnClickListener(commonBook1ClickListener);
        }


        if (Religious3Image != null) {
            Religious3Image.setOnClickListener(commonBook2ClickListener);
        }

        if (Religious4Image != null) {
            Religious4Image.setOnClickListener(commonBook3ClickListener);
        }

    }
}