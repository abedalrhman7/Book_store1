package com.example.book_store1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DataManager extends SQLiteOpenHelper {
    public static final String Database_Name = "BookStore.db";
    public static final int Database_version = 1;
    public static final String Table_Name = "Users";
    public static final String Table_Row_id = "_id";
    public static final String Table_Row_Name = "name";
    public static final String Table_Row_Score = "score";
    public static final String Table_Row_Email = "email";
    public static final String Table_Row_Phone = "phone";
    public static final String Table_Row_Password = "password";

    public DataManager(@Nullable Context context) {
        super(context, Database_Name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + Table_Name + " (" +
                Table_Row_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table_Row_Name + " TEXT, " +
                Table_Row_Email + " TEXT, " +
                Table_Row_Phone + " TEXT, " +
                Table_Row_Password + " TEXT);";
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertData(String name, String email, String phone, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Table_Row_Name, name);
        cv.put(Table_Row_Email, email);
        cv.put(Table_Row_Phone, phone);
        cv.put(Table_Row_Password, password);
        long result = db.insert(Table_Name, null, cv);
        if (result == -1) {
            Log.i("DataManager", "Insert Failed");
        } else {
            Log.i("DataManager", "Data Added Successfully");
        }
    }
    public boolean checkUser(String emailOrPhone, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + Table_Name + " WHERE (" +
                Table_Row_Email + "=? OR " + Table_Row_Phone + "=?) AND " + Table_Row_Password + "=?";
        String[] selectionArgs = {emailOrPhone, emailOrPhone, password};

        return db.rawQuery(query, selectionArgs).getCount() > 0;
    }

}