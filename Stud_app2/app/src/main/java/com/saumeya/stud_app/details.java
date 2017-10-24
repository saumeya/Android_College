package com.saumeya.stud_app;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class details extends AppCompatActivity {

    EditText editRollNo;
    EditText editName;
    EditText editMarks;
    Button btnAdd;
    Button btnShow;
    DBHelper DbHelper = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        editRollNo = (EditText) findViewById(R.id.editRollno);
        editName = (EditText) findViewById(R.id.editName);
        editMarks = (EditText) findViewById(R.id.editMarks);
        btnAdd = (Button) findViewById(R.id.exit);

        btnAdd.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                int roll = Integer.parseInt(editRollNo.getText().toString());
                String name = editName.getText().toString();
                int marks =Integer.parseInt(editMarks.getText().toString());
                //DbHelper.addData(name,roll,marks);
                SQLiteDatabase db = DbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put(Contract.FeedEntry.COLUMN_NAME, name);
                values.put(Contract.FeedEntry.COLUMN_ROLL, roll);
                values.put(Contract.FeedEntry.COLUMN_MARKS, marks);
                Log.v("added","new row id 1"  );

                long newRowId = db.insert(Contract.FeedEntry.TABLE_NAME, null, values);
                Log.v("added","new row id " +newRowId );
                toastMsg("Added");
            }
       });
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        btnShow = (Button)findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Show_dets.class);
                startActivity(intent);

            }

        });

    }
    public void toastMsg(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
