package com.example.groupproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Record extends AppCompatActivity {
    EditText date, weight, bloodglucose,bloodpressure,temperature;
    Button insert, view, delete,back;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        date = findViewById(R.id.date);
        weight= findViewById(R.id.weight);
        bloodglucose = findViewById(R.id.bloodglucose);
        bloodpressure = findViewById(R.id.bloodpressure);
        temperature = findViewById(R.id.temperature);


        insert = findViewById(R.id.btnInsert);
        view = findViewById(R.id.btnView);
        delete = findViewById(R.id.btnDelete);
        back = findViewById(R.id.btn_back);


        DB = new DBHelper(this);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Record.this, Userlist.class));
            }
        });




        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateTXT = date.getText().toString();
                String weightTXT = weight.getText().toString();
                String bloodglucoseTXT = bloodglucose.getText().toString();
                String bloodpressureTXT = bloodpressure.getText().toString();
                String temperatureTXT = temperature.getText().toString();

                Boolean checkinsertdata  = DB.insertuserdata(dateTXT, weightTXT, bloodglucoseTXT, bloodpressureTXT, temperatureTXT);
                if(checkinsertdata==true)
                {
                    Toast.makeText(Record.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Record.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateTXT = date.getText().toString();

                Boolean checkdeletedata  = DB.deleteuserdata(dateTXT);
                if(checkdeletedata==true)
                {
                    Toast.makeText(Record.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Record.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}