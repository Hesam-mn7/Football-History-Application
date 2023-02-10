package com.example.footballihesam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityProfileFinal extends AppCompatActivity {
    TextView tvfinalname , tvfinalemail , tvfinalnumberphone , tvfinalmoredalaghe ;
    Button btnozviat , btnedit , btndate , btndownload , btnsetting , bthome;;
    ImageView backk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile_final);
        init();

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }

        final String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String numberphone = intent.getStringExtra("numberphone");
        String moredalaghe = intent.getStringExtra("moredalaghe");

        tvfinalname.setText(name);
        tvfinalemail.setText(email);
        tvfinalnumberphone.setText(numberphone);
        tvfinalmoredalaghe.setText(moredalaghe);

        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnozviat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog;
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityProfileFinal.this);
                builder.setMessage(name + " عضویت شما با موفقیت انجام شد.");
                builder.setCancelable(false);
                builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent1 = new Intent(MainActivityProfileFinal.this , MainActivity.class);
                        startActivity(intent1);
                    }
                });

                alertDialog = builder.create();
                alertDialog.show();







            }
        });
        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityProfileFinal.this , MainActivity.class);
                startActivity(intent);
            }
        });
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityProfileFinal.this , MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityProfileFinal.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityProfileFinal.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void init(){
        tvfinalname = findViewById(R.id.tvfinalname);
        tvfinalemail = findViewById(R.id.tvfinalemail);
        tvfinalnumberphone = findViewById(R.id.tvfinalnumberphone);
        tvfinalmoredalaghe = findViewById(R.id.tvfinalmoredalaghe);
        btnozviat = findViewById(R.id.btnozviat);
        btnedit = findViewById(R.id.btnedit);
        backk = findViewById(R.id.backk);
        btndate = findViewById(R.id.btndate);
        btndownload = findViewById(R.id.btndownload);
        btnsetting = findViewById(R.id.btnsetting);
        bthome = findViewById(R.id.bthome);



    }
}