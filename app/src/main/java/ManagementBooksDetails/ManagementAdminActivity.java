package ManagementBooksDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.R;

public class ManagementAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_admin);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Management & Business");
        }

        ImageView Management1Image = findViewById(R.id.imageViewManageKeep);
        ImageView Management2Image = findViewById(R.id.imageViewManageTimeManagement);
        ImageView Management3Image = findViewById(R.id.imageViewManageTalkIsnotCheap);
        ImageView Management4Image = findViewById(R.id.imageViewManageHowYoExpandYourBusiness);
        ImageView Management5Image = findViewById(R.id.imageViewManageDierectorsRoom);


        View.OnClickListener commonBookClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagementAdminActivity.this, ManagementKeepYourSeatDetailsActivity.class);
                startActivity(intent);
            }
        };


        View.OnClickListener commonBook1ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagementAdminActivity.this, ManagementTimeManagementDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook2ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagementAdminActivity.this, ManagementTalkIsNotCheapDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook3ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagementAdminActivity.this, ManagementExpandBusinessDetailsActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener commonBook4ClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManagementAdminActivity.this, ManagementDirectorsRoomDetailsActivity.class);
                startActivity(intent);
            }
        };

        if (Management1Image != null) {
                Management1Image.setOnClickListener(commonBookClickListener);
        }

        if (Management2Image != null) {
            Management2Image.setOnClickListener(commonBook1ClickListener);
        }

        if (Management3Image != null) {
            Management3Image.setOnClickListener(commonBook2ClickListener);
        }

        if (Management4Image != null) {
            Management4Image.setOnClickListener(commonBook3ClickListener);
        }

        if (Management5Image != null) {
            Management5Image.setOnClickListener(commonBook4ClickListener);
        }
    }
}