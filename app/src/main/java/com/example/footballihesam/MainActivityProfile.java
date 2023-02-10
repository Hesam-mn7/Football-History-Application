package com.example.footballihesam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivityProfile extends AppCompatActivity {
    EditText etname , etemaill , etnumberphonee , etmoredalaghe;
    Button btnsabtinformation , btndate , btndownload , btnsetting , bthome;
    ImageView backk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);
        init();

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnsabtinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityProfile.this , MainActivityProfileFinal.class);

                try{
                    String name = etname.getText().toString();
                    String email = etemaill.getText().toString();
                    String numberphone = etnumberphonee.getText().toString();
                    String moredalaghe = etmoredalaghe.getText().toString();

                    intent.putExtra("name",name);
                    intent.putExtra("email",email);
                    intent.putExtra("numberphone",numberphone);
                    intent.putExtra("moredalaghe",moredalaghe);

                    AlertDialog alertDialog;
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityProfile.this);
                    builder.setTitle("خطا");
                    builder.setIcon(R.drawable.ic_baseline_error_24);
                    builder.setMessage("اطلاعات خود را کامل وارد کنید.");
                    builder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    if(name.equals("") || email.equals("") || moredalaghe.equals("") || numberphone.equals("")){
                        alertDialog = builder.create();
                        alertDialog.show();
                    }
                    else{
                        startActivity(intent);
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivityProfile.this, "اطلاعات را کامل وارد کنید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityProfile.this , MainActivity.class);
                startActivity(intent);
            }
        });
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityProfile.this , MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityProfile.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityProfile.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void init(){
        etname = findViewById(R.id.etname);
        etemaill = findViewById(R.id.etemaill);
        etnumberphonee = findViewById(R.id.etnumberphonee);
        etmoredalaghe = findViewById(R.id.etmoredalaghe);
        btnsabtinformation = findViewById(R.id.btnsabtinformation);
        backk = findViewById(R.id.backk);
        btndate = findViewById(R.id.btndate);
        btndownload = findViewById(R.id.btndownload);
        btnsetting = findViewById(R.id.btnsetting);
        bthome = findViewById(R.id.bthome);



    }
}