package com.example.footballihesam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivityDaste extends AppCompatActivity {
    ListView listViewDaste;
    Button bthome , btnsetting , btnprofile;
    ImageView backk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_daste);

        init();

        //create list
        listViewDaste = findViewById(R.id.listViewDaste);

        //create data
        String [] data = getResources().getStringArray(R.array.dastearray);

        //create adaptor
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);

        //bind
        listViewDaste.setAdapter(adapter);

        //click
        listViewDaste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(MainActivityDaste.this, MainActivityMoreBook.class);
                    startActivity(intent);
                }
                else if(position == 1 ){
                    Intent intent = new Intent(MainActivityDaste.this, MainActivityMoreMusic.class);
                    startActivity(intent);
                }
                else if(position == 2 ){
                    Intent intent = new Intent(MainActivityDaste.this, MainActivityMoreVideo.class);
                    startActivity(intent);
                }
            }
        });

        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityDaste.this , MainActivity.class);
                startActivity(intent);
            }
        });
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityDaste.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityDaste.this , MainActivityProfile.class);
                startActivity(intent);
            }
        });

    }
    private void init(){
        bthome = findViewById(R.id.bthome);
        backk = findViewById(R.id.backk);
        btnsetting = findViewById(R.id.btnsetting);
        btnprofile = findViewById(R.id.btnprofile);
    }
}