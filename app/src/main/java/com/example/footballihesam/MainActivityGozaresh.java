package com.example.footballihesam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivityGozaresh extends AppCompatActivity {
    ImageView backk;
    Button btnenseraf , btntaiid;
    RadioGroup rggozaresh;

    boolean tatabogh , kharabfile , seda , tasvir , notdownload , kamel , sayer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gozaresh);
        init();
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnenseraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rggozaresh.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtatabogh){
                    tatabogh = true;
                }
                else if(checkedId == R.id.rbkharabfile){
                    kharabfile = true;
                }
                else if (checkedId == R.id.rbseda){
                    seda = true;
                }
                else if (checkedId == R.id.rbtasvir){
                    tasvir = true;
                }
                else if (checkedId == R.id.rbnotdownload){
                    notdownload = true;
                }
                else if (checkedId == R.id.rbkamel){
                    kamel = true;
                }
                else if (checkedId == R.id.rbsayer){
                    sayer = true;
                }

            }
        });
        btntaiid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityGozaresh.this);
                builder.setCancelable(false);
                builder.setPositiveButton("??????????", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                if(tatabogh){
                    builder.setMessage("?????????? ?????? ???? ???????? ?????? ?????????? ?????????? ?????? ????.");
                    tatabogh=false;
                }
                else if(kharabfile){
                    builder.setMessage("?????????? ?????? ???? ???????? ?????????? ???????? ?????? ????.");
                    kharabfile=false;
                }
                else if(seda){
                    builder.setMessage("?????????? ?????? ???? ???????? ???????? ?????? ?????? ????.");
                    seda=false;
                }
                else if(tasvir){
                    builder.setMessage("?????????? ?????? ???? ???????? ???????? ?????????? ?????? ????.");
                    tasvir=false;
                }
                else if(notdownload){
                    builder.setMessage("?????????? ?????? ???? ???????? ?????? ???????????? ?????? ????.");
                    notdownload=false;
                }
                else if(kamel){
                    builder.setMessage("?????????? ?????? ???? ???????? ???????? ?????????? ???????? ?????? ????.");
                    kamel=false;
                }
                else if(sayer){
                    builder.setMessage("?????????? ?????? ???? ?????? ????????.");
                    sayer=false;
                }
                else{
                    builder.setMessage("???? ???????? ???? ???????????? ????????.");
                    builder.setPositiveButton("??????????", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                    });
                    builder.setCancelable(true);
                }
                alertDialog = builder.create();
                alertDialog.show();
            }
        });
        
    }
    private void init(){
        backk = findViewById(R.id.backk);
        btnenseraf = findViewById(R.id.btnenseraf);
        rggozaresh = findViewById(R.id.rggozaresh);
        btntaiid = findViewById(R.id.btntaiid);
    }
}