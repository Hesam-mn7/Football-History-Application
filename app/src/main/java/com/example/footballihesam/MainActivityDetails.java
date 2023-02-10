package com.example.footballihesam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivityDetails extends AppCompatActivity {

    ImageView imgDetail , share , saved , backk;
    TextView tvtitleDetail , tvtitleActionBar , tvDetail;
    Button btnDownload , btnGozaresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_details);
        checkPermission();

        init();

        final Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String title = intent.getStringExtra("title");
        int img = intent.getIntExtra("img", 0);
        final String fileUrlll = intent.getStringExtra("fileUrll");
        String detail = intent.getStringExtra("detail");

        tvtitleDetail.setText(title);
        imgDetail.setImageResource(img);
        tvtitleActionBar.setText(title);
        tvDetail.setText(detail);

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityDetails.this, "قسمت نشان کردن در دست ساخت می باشد", Toast.LENGTH_SHORT).show();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityDetails.this, "قسمت اشتزاک گذاری در دست ساخت می باشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnGozaresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivityDetails.this , MainActivityGozaresh.class);
                startActivity(intent1);

            }
        });

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog;
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityDetails.this);
                builder.setTitle("آیا مطمئن به انجام دانلود هستید ؟");
                builder.setCancelable(false);
                builder.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String fileUrl = fileUrlll;
                        new DownloadTask().execute(fileUrl);
                    }

                });

               builder.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                   }
               });
               alertDialog = builder.create();
               alertDialog.show();
            }
        });

    }
    private void checkPermission(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
        }
    }
    private class DownloadTask extends AsyncTask<String,Integer,String>
    {
        ProgressDialog progressDialog;
        public DownloadTask(){
            progressDialog = new ProgressDialog(MainActivityDetails.this);
            progressDialog.setTitle("دانلود");
            progressDialog.setMessage("در حال دانلود فایل ...");
            progressDialog.setMax(100);
            progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
            progressDialog.setCancelable(false);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.setProgress(0);
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... params) {

            Intent intent = getIntent();

            String namefile = intent.getStringExtra("namefile");

            String outputpatch = "/sdcard/"+namefile;

            String fileUrl = params[0];

            try {
                URL url = new URL(fileUrl);

                URLConnection connection = url.openConnection();

                int lenghtOfFile = connection.getContentLength();

                connection.connect();

                InputStream inputStream = new BufferedInputStream(connection.getInputStream());

                OutputStream outputStream = new FileOutputStream(outputpatch);

                byte[] buffer = new byte[1024];

                int count = -1;
                int total = 0;

                while ((count=inputStream.read(buffer))!=-1){
                    total+=count;
                    publishProgress(((total*100)/lenghtOfFile));
                    outputStream.write(buffer,0,count);
                }
                outputStream.flush();
                outputStream.close();

                inputStream.close();

                NotificationManager manager = (NotificationManager) getSystemService(Service.NOTIFICATION_SERVICE);

                NotificationCompat.Builder builder1 = new NotificationCompat.Builder(MainActivityDetails.this);
                builder1.setContentTitle("دانلود با موفقیت انجام شد");
                builder1.setContentText(namefile);
                builder1.setSmallIcon(R.drawable.icon);

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    builder1.setChannelId("chanelId");
                    NotificationChannel channel = new NotificationChannel("chanelId", "name", NotificationManager.IMPORTANCE_DEFAULT);
                    manager.createNotificationChannel(channel);
                }

                Notification notification = builder1.build();
                manager.notify(1, notification);

                return "دانلود با موفقیت انجام شد";

            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(MainActivityDetails.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                return "دانلود انجام نشد";
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressDialog.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressDialog.dismiss();
            Toast.makeText(MainActivityDetails.this, s, Toast.LENGTH_SHORT).show();

        }
    }
    private void init(){
        tvtitleDetail = findViewById(R.id.tvtitleDetail);
        imgDetail = findViewById(R.id.imgDetail);
        share = findViewById(R.id.share);
        saved = findViewById(R.id.saved);
        backk = findViewById(R.id.backk);
        tvtitleActionBar = findViewById(R.id.tvtitleActionBar);
        btnDownload = findViewById(R.id.btnDownload);
        tvDetail = findViewById(R.id.tvDetail);
        btnGozaresh = findViewById(R.id.btnGozaresh);
    }
}