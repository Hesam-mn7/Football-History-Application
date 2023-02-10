package com.example.footballihesam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.footballihesam.adaptor.CustomAdaptorMore;
import com.example.footballihesam.entity.More;

import java.util.ArrayList;
import java.util.List;

public class MainActivityMoreMusic extends AppCompatActivity {

    ListView listViewMusic;
    ImageView backk;
    Button bthome , btndate , btndownload , btnsetting , btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_more_music);
        init();

        //create listview
        listViewMusic = findViewById(R.id.listViewMusic);

        //create data
        ArrayList<More> data = database();

        //create adaptor
        CustomAdaptorMore customAdaptorMore = new CustomAdaptorMore(this,data);

        //bind
        listViewMusic.setAdapter(customAdaptorMore);

        //click
        listViewMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                More more = (More) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivityMoreMusic.this, MainActivityDetails.class);
                intent.putExtra("title",more.getTitle());
                intent.putExtra("img",more.getImg());
                intent.putExtra("fileUrll",more.getFileUrll());
                intent.putExtra("namefile",more.getNamefile());
                intent.putExtra("detail",more.getDetail());
                startActivity(intent);

            }
        });
        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMoreMusic.this,MainActivity.class);
                startActivity(intent);
            }
        });
        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMoreMusic.this , MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreMusic.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreMusic.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMoreMusic.this , MainActivityProfile.class);
                startActivity(intent);
            }
        });

    }
    private ArrayList<More> database(){
        ArrayList<More> result = new ArrayList<>();
        result.add(new More(R.drawable.manutdg, "سرود باشگاه منچستریونایتد","gloryglory_manunited.mp3","https://ts1.tarafdari.com/contents/user225720/content-sound/manchester-united-glory-glory-song.mp3","ترجمه ی آهنگ گلوری گلوری من یوناتید : افتخار،افتخار،من یونایتد افتخار،افتخار،من یونایتد افتخار،افتخار،من یونایتد   به عنوان یک قرمز پوش قدم بردار به سوی جلو   درست مانند پسران  بازبی(سرمربی سابق منچستریونایتد) در روز هایی که رفتند    ما پرچم های قرمز را بالا نگه خواهیم داشت   شما می توانید خودتان را از دور به خوبی ببینید  شما می توانید آهنگ باشگاه را با افتخار بشنوید   یونایتد! من یونایتد     ما پسرانی هستیم در لباس قرمز و روبه سوی ومبلی داریم   ومبلی، ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   ومبلی،ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   در سال 77 تامی دوچارتی ما را قهرمان کرد     رون اتکینسون در سال 83 افتخار را برای ما آورد     همه می دانند ما که هستیم   ما آهنگ دوری دی به نام Que Sera Sera را خواهیم خواند   یونایتد! من یونایتد   ما پسرانی هستیم در لباس قرمز و روبه سوی ومبلی داریم   ومبلی، ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   ومبلی،ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   افتخار،افتخار،من یونایتد   افتخار،افتخار،من یونایتد   افتخار،افتخار،من یونایتد   به عنوان یک قرمز پوش قدم بردار به سوی جلو   به عنوان یک قرمز پوش قدم بردار به سوی جلو   به عنوان یک قرمز پوش قدم بردار به سوی جلو"));
        result.add(new More(R.drawable.liverpoolg,"سرود باشگاه لیورپول","ynwa_liverpool.mp3","https://ts1.tarafdari.com/contents/user147269/news/liverpool_fc_-_youll_never_walk_alone_-_best_version_-_listen_or_download_0.mp3","ترجمه آهنگ تو تنها قدم نخواهی زد لیورپول : زمانی که از طوفان گذر می کنی     سرت را بالا بگیر     و از سیاهی نترس     در پایان این طوفان    آسمانی طلایی است و    چکاوکی به زیبایی می خواند     در باد به   راهت ادامه بده     زیز باران به راهت ادامه بده    اگر خسته شدی و رویاهایت در آستانه نابودی قرار گرفت     ادامه بده، ادامه بده    با امیدی در قلب    و تو هیچگاه تنها قدم نخواهی زد      تو هیچگاه قدم نخواهی زد    ادامه بده، ادامه بده      با امیدی در قلبت     و تو هیچگاه تنها قدم نخواهی زد    تو هیچگاه قدم نخواهی زد"));
        result.add(new More(R.drawable.realg, "سرود باشگاه رئال مادرید","hala_madrid.mp3","https://ts2.tarafdari.com/contents/user437331/content-sound/pxiyfu0eygzt128.mp3","ترجمه آهنگ هالا مادرید : تاریخ را نوشتید ، اینک آماده اید برای در تاریخ ماندن    چرا که کسی جرئت ندارد ایستادگی کند در برابر اراده تان برای بردن  از بدو طلوع ستاره ها ، چامارتین  قدیمی من    مجذوب کرد ما را از دور و نزدیک گرد هم    جامه ات را به تن می کنم ، به قلبم چفتش می کنم  روزهایی که بازی داری ، از خود بیگانه می شوم    لاسائتا می دود ، رئال مادرید من می تازد    می جنگم ، زیبا هستم ، این سرود را آموختم:    مادرید ، مادرید ، مادرید ، زنده باد مادرید ،   همین و بس ، همین و بس ، زنده باد مادرید    تاریخ را نوشتید ، اینک آماده اید برای در تاریخ ماندن    چرا که هیچ کس یارای ایستادگی ندارد برابر اراده تان را برای بردن  از بدو طلوع ستاره ها ، چامارتین قدیمی من   مجذوب کرد ما را از دور و نزدیک گرده    مادرید ، مادرید ، مادرید ، زنده باد مادرید ،   همین و بس ، همین و   بس ، زنده باد مادرید"));
        result.add(new More(R.drawable.barcag, "سرود باشگاه بارسلونا","barca.mp3","https://ts1.tarafdari.com/contents/user196638/content-sound/barcelona-song.mp3","ترجمه آهنگ بارسلونا : همه استادیوم   همزمان فریاد می زنند   ما هواداران آبی و اناری ها هستیم   فرقی نمی کند اهل کجا باشیم   جنوبی باشیم یا شمالی   اکنون ما همه موافقیم، همه موافقیم،   که یک پرچم ما را در برادری متحد می کند.    پرچم آبی و اناری در باد در اهتزاز است     یک دلاور فریاد می زند   ما نامی داریم که همه آن را می شناسند:    بارسا، بارسا، بااارسا!    بازیکنان، هواداران    اگر متحد باشیم قدرتمندیم.      ما سالها سختکوشانه کار کردیم،     گلهای بسیاری زدیم    و ما نشان داده ایم، نشان داده ایم،    که هیچ کس هیچ گاه نمی تواند ما را بشکند.   پرچم آبی و اناری در باد در اهتزاز است   یک دلاور فریاد می زند   ما نامی داریم که همه آن را می شناسند:  بارسا، بارسا، بااارسا!"));
        result.add(new More(R.drawable.bayerng, "سرود باشگاه بایرن مونیخ","miasanmia.mp3","https://ts1.tarafdari.com/contents/user66769/content-sound/16_hino_bayern_munchen.mp3","ترجمه آهنگ بایرن مونیخ : کدوم تیمه فوتبال مونیخه که همه جا طرفدار داره؟   کدوم تیمه که همه رکوردهای آلمان تو دستشه؟    کدوم تیمه که تموم جامها رو برده؟  کدوم تیمه که همه تیمهای بوندسلیگا رو شکست داده؟   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…   اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،   بله، این راهی است که بوده و همیشه خواهد بود…   اونجا کجاست که براش فالگوش وایمیسن و هرروز براش جاسوس میفرستن؟!   خبرنگارا کجان همیشه؟   نظرا همه به کجاست؟   همیشه راجع به کجا بحث میکنن؟   برای بازی کی همه ی بلیط ها فروخته میشه؟    کی به هوادارای حریف فشار زیادی وارد میکنه؟   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…    اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،   بله، این راهی است که بوده و همیشه خواهد بود…  در بوندسلیگا یا جام حذفی یا حتی لیگ قهرمانان اوروپا،   چیزی زیبا تر از پیروز شدن بایرن وجود داره؟   اینجا زندگی، عشق و خوشبختی هست برای همین هم مونیخه من  برای ابد بهترینه توی آلمان…   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…  اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،  بله، این راهی است که بوده و همیشه خواهد بود"));
        return result;
    }
    private void init(){
        backk = findViewById(R.id.backk);
        bthome = findViewById(R.id.bthome);
        btndate = findViewById(R.id.btndate);
        btndownload = findViewById(R.id.btndownload);
        btnsetting = findViewById(R.id.btnsetting);
        btnprofile = findViewById(R.id.btnprofile);


    }
}