package com.example.book_store1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataManager extends SQLiteOpenHelper {
    public static final String Database_Name = "BookStore.db";
    public static final int Database_version = 1;
    public static final String Table_Name = "Users";
    public static final String Table_Row_id = "_id";
    public static final String Table_Row_Name = "name";
    public static final String Table_Row_Score = "score";

    public DataManager(@Nullable Context context) {
        super(context, Database_Name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="Create Table "+ Table_Name+ Table_Row_id +
                " INTEGER primary key autoincrement " + Table_Row_Name + " TEXT " + Table_Row_Score + " INTEGER;";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name);
        onCreate(db);
    }
}
