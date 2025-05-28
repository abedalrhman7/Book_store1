package MentalBooksDetails;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.book_store1.DataManager;
import com.example.book_store1.R;

public class FavoriteActivity extends AppCompatActivity {
    DataManager db;
    LinearLayout favoriteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);

        db = new DataManager(this);
        favoriteList = findViewById(R.id.favoriteList);

        SQLiteDatabase database = db.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + DataManager.Favorites_Table, null);

        if (cursor.moveToFirst()) {
            do {
                String title = cursor.getString(cursor.getColumnIndexOrThrow(DataManager.Fav_Col_Title));
                String desc = cursor.getString(cursor.getColumnIndexOrThrow(DataManager.Fav_Col_Description));
                String image = cursor.getString(cursor.getColumnIndexOrThrow(DataManager.Fav_Col_Image));

                View view = LayoutInflater.from(this).inflate(R.layout.favorite_item, null);
                ((TextView) view.findViewById(R.id.favTitle)).setText(title);
                ((TextView) view.findViewById(R.id.favDesc)).setText(desc);
                ((ImageView) view.findViewById(R.id.favImage)).setImageResource(
                        getResources().getIdentifier(image, "drawable", getPackageName())
                );

                favoriteList.addView(view);
            } while (cursor.moveToNext());
        }

        cursor.close();
    }
}
