package com.saumeya.stud_app;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.Cursor;
import android.widget.Toast;

public class Search extends AppCompatActivity {


    EditText searchNo;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search = (Button) findViewById(R.id.button3);

        search.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                searchData();
            }


        });

    }
    public void searchData(){
        searchNo = (EditText) findViewById(R.id.searchNo);
        String r = searchNo.getText().toString();
        DBHelper DbHelper = new DBHelper(this);
        SQLiteDatabase db = DbHelper.getReadableDatabase();
        Log.v("ok","no error get readable");
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
         Contract.FeedEntry.COLUMN_ROLL
        };
        Toast.makeText(this,"Searching",Toast.LENGTH_SHORT);
        // Filter results WHERE "title" = 'My Title'
        String selection = Contract.FeedEntry.COLUMN_ROLL + " = ?";
        String[] selectionArgs = { r };

        Cursor cursor = db.query(
                Contract.FeedEntry.TABLE_NAME,                     // The table to query
                projection,                               // The columns to return
                selection,                                // The columns for the WHERE clause
                selectionArgs,                            // The values for the WHERE clause
                null,                                     // don't group the rows
                null,                                     // don't filter by row groups
                null                                     // The sort order
        );
        Toast.makeText(this,"Searching",Toast.LENGTH_SHORT).show();
        if (cursor.getCount() == 0){
            Toast.makeText(this,"Not Found",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this," Found",Toast.LENGTH_SHORT).show();
        }

            cursor.close();

    }
}