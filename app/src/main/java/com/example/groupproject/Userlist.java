package com.example.groupproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Currency;

public class Userlist extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> date, weight, bloodglucose,bloodpressure,temperature;
    DBHelper DB;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);
        DB = new DBHelper(this);
        date = new ArrayList<>();
        weight = new ArrayList<>();
        bloodglucose = new ArrayList<>();
        temperature = new ArrayList<>();
        bloodpressure = new ArrayList<>();




        recyclerView = findViewById(R.id.recyclerview);
        adapter = new MyAdapter(this, date, weight, bloodglucose,bloodpressure,temperature);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();
    }

    private void displaydata()
    {
        Cursor cursor = DB.getdata();
        if(cursor.getCount()==0)
        {
            Toast.makeText(Userlist.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while(cursor.moveToNext())
            {
                date.add(cursor.getString(0));
                weight.add(cursor.getString(1));
                bloodglucose.add(cursor.getString(2));
                bloodpressure.add(cursor.getString(3));
                temperature.add(cursor.getString(4));

            }
        }
    }
}