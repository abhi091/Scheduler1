package com.srmgmail.anand.kr.scheduler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Anand_Kumar on 4/5/2017.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "tt.db";
    public static final String TABLE_NAME = "classes";
    public static final String COLUMN_CLASS_NAME = "class";
    public static final String COLUMN_BUILDING = "building";
    public static final String COLUMN_MONDAY_START = "mondaystart";
    public static final String COLUMN_MONDAY_END = "mondayend";
    public static final String COLUMN_TUESDAY_START = "tuesdaystart";
    public static final String COLUMN_TUESDAY_END = "tuesdayend";
    public static final String COLUMN_WEDNESDAY_START = "wednesdaystart";
    public static final String COLUMN_WEDNESDAY_END = "wednesdayend";
    public static final String COLUMN_THURSDAY_START = "thursdaystart";
    public static final String COLUMN_THURSDAY_END = "thursdayend";
    public static final String COLUMN_FRIDAY_START = "fridaystart";
    public static final String COLUMN_FRIDAY_END = "fridayend";

     public DBHelper(Context context) {
        super(context ,DATABASE_NAME , null , 1);
     }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String commnad = "CREATE TABLE" + TABLE_NAME + " (" +
                COLUMN_CLASS_NAME + " TEXT PRIMARY KEY, " +
                COLUMN_BUILDING + " TEXT, " +
                COLUMN_MONDAY_START + " TEXT, " +
                COLUMN_MONDAY_END + " TEXT, " +
                COLUMN_TUESDAY_START + " TEXT, " +
                COLUMN_TUESDAY_END + " TEXT, " +
                COLUMN_WEDNESDAY_START + " TEXT, " +
                COLUMN_WEDNESDAY_END + " TEXT, " +
                COLUMN_THURSDAY_START + " TEXT, " +
                COLUMN_THURSDAY_END + " TEXT, " +
                COLUMN_FRIDAY_START + " TEXT, " +
                COLUMN_FRIDAY_END + " TEXT)";
        db.execSQL(commnad);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String command =  "DROP TABLE IF EXIST" + TABLE_NAME;
        db.execSQL(command);
        onCreate(db);
    }

    public  void insertClass(String class_name ,String builing , ArrayList <String> timings){
        
    }

}
