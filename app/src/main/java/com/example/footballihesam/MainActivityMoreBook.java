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

public class MainActivityMoreBook extends AppCompatActivity {

    ListView listViewBook;
    ImageView backk;
    Button bthome , btndate , btndownload , btnsetting , btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_books);

        init();

        //create listview
        listViewBook = findViewById(R.id.listViewBook);

        //create data
        ArrayList<More> data = database();

        //create adaptor
        CustomAdaptorMore customAdaptorMore = new CustomAdaptorMore(this,data);

        //bind
        listViewBook.setAdapter(customAdaptorMore);

        //click
        listViewBook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                More more = (More) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivityMoreBook.this, MainActivityDetails.class);
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
                Intent intent = new Intent(MainActivityMoreBook.this,MainActivity.class);
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
                Intent intent = new Intent(MainActivityMoreBook.this , MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreBook.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityMoreBook.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityMoreBook.this , MainActivityProfile.class);
                startActivity(intent);
            }
        });

    }

    private ArrayList<More> database() {

        ArrayList<More> result = new ArrayList<>();
        result.add(new More(R.drawable.footballdoshman, "فوتبال علیه دشمن","Football against enemy.pdf","https://s3.amazonaws.com/covington-library/FileID-FATEPDF-92.pdf","«فوتبال علیه دشمن» یکی از کتاب های ستایش برانگیز عرصه فوتبال است. سایمون کوپر، خبرنگار انگلیسی به 22 کشور جهان سفر می کند و تاریخ فوتبال رادر بازی های تاثیرگذار و جنجالی مرور می کند. در این کتاب فوتبال پا از یک «بازی» فراتر می گذارد و در مقاطعی حتی پا به عرصه نبردهای بین المللی و صحنه های سیاسی می گذارد: «دو روز پس از اینکه وارد بوینس آیرس شدم، آرژانتین به مصاف برزیل رفت. مسابقه رسما صدمین سالگرد فدراسیون فوتبال آرژانتین را جشن می گرفت، ولی دلیل اصلی شادی مردم، بازگشت دیه گو مارادونا به تیم ملی برای اولین بار پس از محرومیتش به خاطر استعمال کوکائین بود... در ورزشگاه سروصدای زیادی برای بازی مقابل برزیل به پا شده بود. در پاسخ به شعار «اگر نپری، انگلیسی هستی» (اشاره به جنگ آرژانتین و انگلیس بر سر جزایر فالکلند)، نیمی از جمعیت به پرواز درمی آمدند، اما به من گفتند اکثر اوقات آنها فقط این آواز را می خواندند: برزیلی ها، برزیلی ها/ چقدر بدبخت به نظر می رسید/ مارادونا آرژانتینی است/ و از پله بهتر است». در این کتاب جزییات دوستی ها، خصومت ها، پیشینه برخی شعارها و جنجال های تاریخی فوتبال، همگی حضور دارند. کوپر با فوتبالیست ها، هواداران، خبرنگارها و حتی سیاستمدارهای زیادی در سراسر جهان صحبت می کند؛ در آمریکا، اروپا و آفریقا و خاورمیانه و کشورهای دور و نزدیک. او می خواهد تاثیر فوتبال بر سیاست و فرهنگ کشورها را دریابد. مصاحبه های دردسرساز و ممنوعه ترتیب می دهد، به برنامه های گروه های تروریستی سرک می کشد، اطلاعات عجیب و غریب از گروه های مافیایی و دست های نامرئی فوتبال کشف می کند و کتابش را در بازه زمانی حدود یک سال شکل می دهد. سایمون کوپر نشان می دهد فوتبال برای بازیکنان و هواداران و حتی سیاستمداران تنها یک بازی نیست، بلکه بسیار فراتر از چیزی است که ما به نام فوتبال می شناسیم. این کتاب با ترجمه عادل فردوسی پور، یکی از بهترین کتاب هایی است که در جهان در زمینه فوتبال نوشته شده."));
        result.add(new More(R.drawable.zandeghiname, "زندگینامه من","My Autobiography.pdf","http://media.specialolympics.org/soi/files/sports/Football/e63t2llj/Teaching.pdf","کتاب سرمربی سابق شیاطین سرخ در 320 صفحه قطع وزیری که شامل 25 فصل پرهیجان و همچنین بخش آلبوم تصاویر رنگی است،با استقبال مخاطبان هم روبه رو شد.  این کتاب پر از رمز و رازهای دنیای شخصی و فوتبالی بازیکنان و مربیان مشهور جهان است که خواندن آن همان قدر که برای جوانان فوتبال دوست ایرانی جالب توجه خواهد بود، برای مربیان ایرانی هم بسیار مفید و حائز اهمیت است.  دلایل اخراج و شکافتن ابروی بکهام»، «دلایل اخراج روی کین و یاپ استام»، «دلایل مانایی و تمام نشدنی بودن رایان گیگز»، «عوامل پیشرفت کریس رونالدو»، «دلایل شکست منچستر از بارسلونا در دو فینال لیگ قهرمانان»، «مقایسه دقیق رونالدو و مسی از زبان فرگوسن و اشمایکل»، «ماجراهای درگیری رونی و رونالدو در جام جهانی 2010»، «چرایی عدم قبول مربیگری تیم ملی انگلیس از سوی فرگوسن»، «خصوصیات منحصر به فرد کارلوس کیروش از زبان فرگوسن و دیگر بزرگان فوتبال»، «محبوبیت سلطان اولدترافورد؛ اریک کانتونا در نزد هواداران»، «فن نیستلروی، یک بازیکن معمولی اما یک گلزن مادرزاد»، «پل اسکولز، بهترین هافبک تاریخ انگلیس»، «یک شب در لندن، جدال فینال لیگ قهرمانان با چلسی» و «چرخ و فلک بارسلونا، نابودکننده بازی هر تیمی» از فصل های این کتاب به شمار می آیند."));
        result.add(new More(R.drawable.laws, "قوانین بازی فوتبال","Lows of the Game.pdf","https://img.fifa.com/image/upload/datdz0pms85gbnqy4j3k.pdf","فوتبال بزرگترین ورزش روی زمین است. این بازی در هر کشور و بسیاری از کشورها پخش می شود . سطوح مختلف قوانین بازی در کل فوتبال در کل یکسان است .  در تمام دنیا از جام جهانی تا بازی بین جوانان و کودکان در یک روستای دور افتاده باید قوانین یکسان در هر مسابقه در هر کشور ، شهر و روستا در سراسر جهان نقطه قوت قابل توجهی است که باید حفظ شود این همچنین فرصتی است که باید از آن استفاده شود . همه جا فوتبال خوب است. فوتبال باید قوانینی داشته باشد که بازی را عادلانه به عنوان پایه اساسی آن حفظ کند . زیبایی یک بازی زیبا عادلانه بودن آن است . این یک ویژگی حیاتی است . بهترین مسابقات آنهایی است که بازیکنان با احترام به یکدیگر بازی می کنند و به تصمیمات مسئولان مسابقه و قوانین آن احترام میگذارند . یکپارچگی قوانین و داورانی که آنها را اعمال می کنند ، همیشه باید محافظت شده باشد و مورد احترام است. همه صاحبان قدرت ، به ویژه مربیان و تیم کاپیتان ها ، در قبال بازی مسئولیت واضحی دارند که به مقامات مسابقه و تصمیمات آنها احترام بگذارند ."));
        result.add(new More(R.drawable.tutorials, "آموزش فوتبال","FootballTutorialspoint.pdf","https://www.tutorialspoint.com/football/football_tutorial.pdf","کتاب آموزش فوتبال با مشاهده بازی های امروزی در گوشه و کنار جهان و طرافداران بیش از حد آن عرضه شده است . کتاب آموزش فوتبال در رابطه به اینکه ورزش فوتبال در وضعیت خوبی بوده و تمامی جهان را در برگرفته است و محبوبیت فراوانی دارد طراحی شده است . ملت های جوان در حال پیشرفت در فوتبال هستند و با کشورهای صاحب فوتبال مسابقه می دهند. فوتبال در تاکتیک، پیشرفت و توسعه فراوانی یافته است، بازی سریع تر شده است و تعداد گلهای به ثمر رسیده در هر بازی افزایش یافته و بازیکنان باهوش خود را بیش از پیش مطرح کرده اند اما هنوز بعضی اعتقاد دارند که مهارتهای تکنیکی بازیکن، آگاهی های تاکتیکی از بازی و شرایط ذهنی بازیکنان می تواند بیش از این توسعه یابد.سطح  فوتبال پیشرفت کرده است . تمرینات فیزیکی، سرعتی و قدرتی افزایش یافته اند اما تاکتیک ها همان تاکتیک های قدیم است و در این جاست که مهارتهای تکنیکی انفرادی تعیین کننده هستند. به عبارتی دیگر فوتبال باید جنبه های تماشایی و هیجان آور این بازی را در آینده نیز همچنان تامین کند. ما باید روشی سختگیرانه در رابطه با آموزش فوتبال در پیش بگیریم و در همان حال افق دید خود را توسعه دهیم. فوتبال باید یک مدرسه زندگی به تمام معنا باشد نه تنها در پرورش بازیکنان حرفه ای بلکه به عنوان واسطه ای برای کمک به جوانان تا شخصیت آنان آگاهی های عمومی ، فرهنگ و مهارت های تاثیر گذار اجتماعی به طور کامل شکوفا شود. به مربیان آینده شرح وظایفی در مورد پرورش بازیکنان واگذار خواهد شد تا بتوانند استعدادهای پنهان بازیکنان جوان را کشف کنند. در این راه بازیکنان جوان اجازه می یابند تا آزادانه توانائی های فردی خود را بروز دهند."));
        result.add(new More(R.drawable.ruziruzeghari, "روزی روزگاری فوتبال","Football3 handbook.pdf","https://www.streetfootballworld.org/sites/default/files/football3%20Handbook.pdf","روزی روزگاری فوتبال یکی از آثار تالیفی بسیار خوب در زمینه فوتبال است که حمیدرضا صدر تلاش کرده نگاهی جامعه شناسانه در این کتاب به فوتبال داشته باشد. فوتبال در این کتاب تمام پهنه های جغرافیایی را طی می کند؛ از زمین های خاکی تهران تا ترکیه، از ایتالیا و اسپانیا تا آلمان و انگلیس، از برزیل و آرژانتین تا مکزیک. حمیدرضا صدر در این کتاب از فرهنگی به فرهنگ دیگر می رود، فوتبال و مردم، فوتبال و سیاست و فوتبال و زندگی را در نگاهی موشکافانه به هم پیوند می زند و از پدیده ای سخن می گوید که دل های مردم سراسر دنیا را بی بهانه و با بهانه به هم وصل کرده است. او این کتاب را نمایشگر رویارویی شور مردم و قدرت طلبی سیاست پیشگان حول مستطیل سبز و دایره سفید می داند؛ دایره ای که در این مستطیل از حرکت باز نمی ایستد و بی وقفه می چرخد. قلم حمیدرضا صدر در «روزی روزگاری فوتبال»، بازتابنده شیفتگی مهارناپذیر آدم هایی است که نمی توانند دل هایشان را از فوتبال بکنند؛ توصیف کننده برق چشم های مشتاقی که نمی توانند مستطیل سبز را تماشا نکنند: «در پاییز 1997 چه حوادثی توجه جهانیان را جلب کرد؟ سرقت 17 میلیون دلاری از بانک لومیس فراگو در کارولینای شمالی؟ قتل عام 43 نفر در الجزایر؟ خاکسپاری بقایای جسد ارنستو چه گوارا در سانتا کلارا در کوبا؟ محروم شدن مایکل شوماخر به دلیل تخلف حین مسابقه؟ ولی پاییز 1997 برای ایرانیان با نبرد پرشور استرالیا در آخرین مسابقه برای راهیابی به جام جهانی فرانسه گره خورد، با کسب جواز راهیابی به جام جهانی... نبرد ملبورن، نبرد تاریخی فوتبال ایران شد. نبرد ملبورن در هشتم آذر 1376، در استادیوم  ام اس جی ، پر تب و تاب ترین خاطره ایرانیان آن عصر شد... ویرا پس از بازی گفت: نشسته بودم و دعا می خواندم. حمیدرضا صدر چهره شناخته شده عرصه فوتبال و تحلیلگر نام آشنای سالیان دراز این ورزش، از تجربیات و اطلاعات خود استفاده می کند و کتابی تاثیرگذار می نویسند به نام : روزی روزگاری فوتبال ."));

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