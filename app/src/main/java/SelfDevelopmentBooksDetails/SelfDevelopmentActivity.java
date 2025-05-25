package SelfDevelopmentBooksDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;

import ReligiousBooksDetails.ReligiousMessageDetailsActivity;
import ReligiousBooksDetails.ReligiousStudiesActivity;
// import android.widget.Button;
// import android.view.View;
// import android.widget.Toast;

public class SelfDevelopmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_development);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Self Development");
        }

        ImageView Self1Image = findViewById(R.id.imageViewSelfDevelopSelfInvestment);
        ImageView Self2Image = findViewById(R.id.imageViewSelfDevelopDecodeYourBody);
        ImageView Self3Image = findViewById(R.id.imageViewSelfDevelopSecondChance);
        ImageView Self4Image = findViewById(R.id.imageViewSelfDevelopDontSayIDidntWarnYou);

        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelfDevelopmentActivity.this, SelfDevelopmentInvestmentDetails.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelfDevelopmentActivity.this, SelfDevelopmentDecodeBodyDetails.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelfDevelopmentActivity.this, SelfDevelopmentIdidntWarnDetails.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelfDevelopmentActivity.this, SelfDevelopmentSecondChanceDetails.class);
                startActivity(intent);
            }
        };

        if (Self1Image != null) {
            Self1Image.setOnClickListener(commonBookClickListener);
        }

        if (Self2Image != null) {
            Self2Image.setOnClickListener(commonBook1ClickListener);
        }

        if (Self4Image != null) {
            Self4Image.setOnClickListener(commonBook2ClickListener);
        }

        if (Self3Image != null) {
            Self3Image.setOnClickListener(commonBook3ClickListener);
        }

    }
}