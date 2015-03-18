package pbg.se55.mypc.phuketbusguideline;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by My PC on 17/3/2558.
 */
public class PbgDbClass extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    // Database Version
    public static final int DATABASE_VERSION = 1;
    // Database Name
    public static final String DATABASE_NAME = "PBG.db";

    public PbgDbClass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

