package com.example.sqlite_ins_sel;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;

public class DbHelper extends SQLiteOpenHelper {
    public static final String CUST_INFO = "Cust_details";

    public DbHelper(@Nullable Context context) {
        super(context, "CUSTOMER.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = "CREATE TABLE " + CUST_INFO + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Age INTEGER, ActiveStatus BOOL)";
        db.execSQL(sqlQuery);

    }

    @Override
    //To upgrade version
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean dbInsert(Customer cust){
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Name,cust.getName());
        values.put(Age,cust.getName());
        values.put(ActiveStatus,cust.getName());
        long insert =sqlDB.insert(CUST_INFO,null,values);
        if(insert == -1){
            return false;
        }
        else{
            return true;
        }


    }
}
