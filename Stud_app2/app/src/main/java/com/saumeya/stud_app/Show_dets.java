package com.saumeya.stud_app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Show_dets extends AppCompatActivity {
    TextView shw_dets ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_dets);
        showData();
    }

    public void showData(){
        shw_dets = (TextView) findViewById(R.id.shw_dets);
        DBHelper DbHelper = new DBHelper(this);
        SQLiteDatabase db = DbHelper.getReadableDatabase();
        Log.v("ok","no error getreadable");

        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                Contract.FeedEntry.COLUMN_NAME,
                Contract.FeedEntry.COLUMN_ROLL,
                Contract.FeedEntry.COLUMN_MARKS
        };
        Cursor cursor = db.query(
                Contract.FeedEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // don't group the rows
                null,                           // don't filter by row groups
                null                            // The sort order
        );

        int i = 1;
        try{
            shw_dets.setText("Table  contains  "+cursor.getCount()+"  students  \n\n\n\n");
            shw_dets.append("Sr.\t\t\t\t"+Contract.FeedEntry.COLUMN_NAME+"\t\t\t\t"+
                    Contract.FeedEntry.COLUMN_ROLL+"\t\t\t\t"+
                    Contract.FeedEntry.COLUMN_MARKS);
            int nameColumnIndex = cursor.getColumnIndex(Contract.FeedEntry.COLUMN_NAME);
            int rollColumnIndex = cursor.getColumnIndex(Contract.FeedEntry.COLUMN_ROLL);
            int marksColumnIndex = cursor.getColumnIndex(Contract.FeedEntry.COLUMN_MARKS);

            while(cursor.moveToNext()){
                String currentName = cursor.getString(nameColumnIndex);
                String currentRoll = cursor.getString(rollColumnIndex);
                String currentMarks = cursor.getString(marksColumnIndex);
                shw_dets.append(("\n\n"+i+"\t\t\t\t"+currentName+"\t\t\t\t\t"+currentRoll+"\t\t\t\t\t"+currentMarks));
                i++;

            }

        }finally {
            cursor.close();
        }
    }
}
/*
SQLiteDatabase db = mDbHelper.getReadableDatabase();

// Define a projection that specifies which columns from the database
// you will actually use after this query.
String[] projection = {
    FeedEntry._ID,
    FeedEntry.COLUMN_NAME_TITLE,
    FeedEntry.COLUMN_NAME_SUBTITLE
    };

// Filter results WHERE "title" = 'My Title'
String selection = FeedEntry.COLUMN_NAME_TITLE + " = ?";
String[] selectionArgs = { "My Title" };

// How you want the results sorted in the resulting Cursor
String sortOrder =
    FeedEntry.COLUMN_NAME_SUBTITLE + " DESC";

Cursor cursor = db.query(
    FeedEntry.TABLE_NAME,                     // The table to query
    projection,                               // The columns to return
    selection,                                // The columns for the WHERE clause
    selectionArgs,                            // The values for the WHERE clause
    null,                                     // don't group the rows
    null,                                     // don't filter by row groups
    sortOrder                                 // The sort order
    );
 */

/*
List itemIds = new ArrayList<>();
while(cursor.moveToNext()) {
  long itemId = cursor.getLong(
      cursor.getColumnIndexOrThrow(FeedEntry._ID));
  itemIds.add(itemId);
}
cursor.close();
 */