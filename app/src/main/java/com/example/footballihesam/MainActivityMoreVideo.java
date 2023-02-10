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

public class MainActivityMoreVideo extends AppCompatActivity {

    ListView listViewVideo;
    ImageView backk;
    Button bthome , btndate , btndownload , btnsetting , btnprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_more_video);
        init();

        //create listview
        listViewVideo = findViewById(R.id.listViewVideo);

        //create data
        ArrayList<More> data = database();

        //create adaptor
        CustomAdaptorMore customAdaptorMore = new CustomAdaptorMore(this,data);

        //bind
        listViewVideo.setAdapter(customAdaptorMore);

        //click
        listViewVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                More more = (More) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivityMoreVideo.this, MainActivityDetails.class);
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
                Intent intent = new Intent(MainActivityMoreVideo.this,MainActivity.class);
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
                Intent intent = new Intent(MainActivityMoreVideo.this , MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreVideo.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreVideo.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMoreVideo.this , MainActivityProfile.class);
                startActivity(intent);
            }
        });

    }
    private ArrayList<More> database() {

        ArrayList<More> result = new ArrayList<>();
        result.add(new More(R.drawable.italy_ger,"آلمان - ایتالیا", "ger_ity.mp4","https://ts5.tarafdari.com/contents/user160399/video/italy_2-0_germany_-_germany_world_cup_-_2006.mp4","چهارم جولای 2006 و دیدار حساس آلمان و ایتالیا از مرحله نیمه نهایی جام جهانی ؛ بازی در ورزشگاه وستفالن شهر دورتموند (که اکنون با نام سیگنال ایدونا پارک شناخته می شود) برگزار می شد. آلمانِ میزبان در این مرحله باید با حریف سرسختی همچون ایتالیا روبرو شود. آلمان ها که با حذف آرژانتین به این مرحله رسیدند اصلا دلشان نمیخواهد در حضور هوادارنشان شکست بخورند و به کمتر قهرمانی قانع نیستند . ایتالیای جذاب مارچلو لیپی هم با ستاره هایی مثل بوفون ، دلپیرو ، توتی و کاناوارو به دنبال قهرمانی برای این نسل طلایی هستند . "));
        result.add(new More(R.drawable.barca_liver,"لیورپول - بارسلونا", "barca_liver.mp4","https://ts2.tarafdari.com/contents/user137370/video/liverpool_4_0_barcelona_hl_ucl_2019_semifinal.mp4","در یکی از بازی های برگشت دور نیمه نهایی لیگ قهرمانان اروپا دو تیم فوتبال لیورپول و بارسلونا در شهر لیورپول و ورزشگاه آنفیلد به مصاف یکدیگر رفتند. بارسلونا با حذف لیون و منچستریونایتد به این مرحله رسیده بود و لیورپول با شکست بایرن مونیخ و پورتو .  بازی رفت این دو تیم در نیوکمپ با درخشش مسی و پیروزی 3 بر 0 کاتالان ها به پایان رسیده بود. در این بازی محمد صلاح و سادیو مانه ستارگان لیورپول غایب بودند و شاید کسی تصوری برای بازگشت لیورپول نبود ولی در آنفیلد غیر ممکن ها ممکن میشود . بارسلونا هم بعد از حذف تلخ فصل پیششان برابر رم اصلا دوست ندارند این اتفاق تکرار شود ."));
        result.add(new More(R.drawable.mu_real,"منچستریونایتد - رئال مادرید", "manutd-real.mp4","https://ts5.tarafdari.com/contents/user160399/video/man_united_4-3_real_madrid_-_ucl_-_2002-03.mp4","23 آوریل سال 2003، دیدار برگشت مرحله یک چهارم نهایی لیگ قهرمانان اروپا بین تیم های منچستریونایتد و رئال مادرید در حضور 66 هزار تماشاگر حاضر در ورزشگاه اولدترافورد برگزار شد. شیاطین سرخ در انتهای فصل 2002/03 با کسب 83 امتیاز و بالاتر از آرسنال 78 امتیازی به مقام قهرمانی لیگ برتر انگلستان دست یافتند. رئال مادرید دلبوسکه نیز در این فصل با کسب 78 امتیاز به مقام قهرمانی لالیگا نائل شد. خلاصه ای از این دیدار جذاب و تماشایی را می توانید مشاهده کنید. دیدار رفت دو تیم در سانتیاگو برنابئو با برتری 3-1 رئالی ها به پایان رسید و شیاطین سرخ در صدد بازگشت هستند . در این دیدار شاهد رویایی ستارگانی مانند رونالدو نازاریو ، بکام ، کاسیاس ، سولسشر ، زیدان ، اسکولز ، رائول ، فن نیستروی ، گوتی و گیگز هستیم ."));
        result.add(new More(R.drawable.chelsea_liver,"چلسی - لیورپول", "che-liv.mp4","https://ts5.tarafdari.com/contents/user7410/video/chelsea204-420liverpool20_20frank20lampard20double20puts20chelsea20through20_20champions20league20highlights.mp4","در لیگ قهرمانان اروپا در فصل 2009 دو تیم لیورپول و چلسی در مرحله یک چهارم نهایی تقابل تمام انگلیسی را به وجود آوردند . بازی رفت دو تیم در آنفیلد با برتری 3-1 شاگردان گاس هیدینگ همراه بود . برنده در دور نیمه نهایی به مصاف بارسای پپ خواهد رفت . لیورپول رافا بنتیز که در لیگ در کورس قهرمانی با منچستریونایتد هستند به دنبال کسب دوگانه میباشند . در نهایت در پایان این فصل لیورپول به مقام دوم لیگ رسید و چلسی سوم شد . این دیدار خاطره و پر گل را خواهیم دید . "));
        result.add(new More(R.drawable.barca_real,"رئال مادرید - بارسلونا", "barca_real.mp4","https://ts5.tarafdari.com/contents/user306454/video/madrid.vs_.barc_.2009.2_6.mp4","سال 2009 دو تیم رئال مادرید و بارسلونا در ورزشگاه سانتیاگو برنابئو شهر مادرید به مصاف هم رفتند. در این مسابقه شاگردان پپ گواردیولا موفق شدند یکی از سنگین ترین شکست های تاریخ رئال مادرید را رقم بزنند و رقیب دیرینه ی خود را تحقیر کنند. بارسلونا در این فصل موفق به کسب سه گانه و شاهد دوران اوج مسی ، اتوو ، هانری ، ژاوی و اینیستا هستیم ."));
        result.add(new More(R.drawable.mu_juve,"یوونتوس - منچستریونایتد", "mu_juve.mp4","https://ts5.tarafdari.com/contents/user306454/video/juve.vs_.utd1999.mp4","در این ویدیو مروری خواهیم داشت به بازی خاطره انگیز یوونتوس و منچستریونایتد در لیگ قهرمانان اروپا در دور برگشت مرحله نیمه نهایی فصل 1998/99 که در بازی رفت دو تیم در اولدترافورد با تساوی یک یک به پایان رسید. نتیجه که مطابق میل شاگردان آنجلوتی بود و آنها میتوانند با برتری مقابل منچستریونایتد حریف بایرن مونیخ در فینال نیوکمپ شود . منچستریونایتد فرگوسن هم با داشتن ستاره هایی مانند بکام ، گیگز ، اسکولز و اشمایکل بعد از قهرمانی در لیگ و جام حذفی رویای کسب سه گانه را دارند ."));

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