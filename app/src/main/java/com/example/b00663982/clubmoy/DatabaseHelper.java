package com.example.b00663982.clubmoy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "facilities.db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_FACILITES_TABLE = "CREATE TABLE booking_form ("  +"BOOKINGID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "ROOM TEXT, " +
                "DATE DATE, " +
                "TIME TIME, " +
                "LENGTH INTEGER)";

        db.execSQL(CREATE_FACILITES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS booking_form");
            this.onCreate(db);
    }

    private static final String TABLE_FACILTIES = "facilties";

    private static final String KEY_BOOKING_ID = "bookingid";
    private static final String KEY_ROOM = "room";
    private static final String KEY_DATE = "date";
    private static final String KEY_TIME = "time";
    private static final String KEY_LENGTH = "length";

    private static final String [] COLUMNS = {KEY_BOOKING_ID,KEY_ROOM,KEY_DATE,KEY_TIME,KEY_LENGTH};

    public void addBooking(Bo)

}
