package com.example.footballihesam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.footballihesam.adaptor.CustomAdaptorVideo;
import com.example.footballihesam.entity.More;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ImageView imgbook1, imgbook2, imgbook3, imgbook4, imgbook5, imgmusic1, imgmusic2, imgmusic3, imgmusic4, imgmusic5;
    TextView tvbook1, tvbook2, tvbook3, tvbook4, tvbook5, more_book, tvmusic1, tvmusic2, tvmusic3, tvmusic4, tvmusic5, moreMusic, moreVideo;
    Button btndate, btndownload, btnsetting, btnprofile;
    GridView gvVideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        imgbook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "فوتبال علیه دشمن");
                intent.putExtra("img", R.drawable.footballdoshman);
                intent.putExtra("namefile", "Football against enemy.pdf");
                intent.putExtra("fileUrll", "https://s3.amazonaws.com/covington-library/FileID-FATEPDF-92.pdf");
                intent.putExtra("detail", "«فوتبال علیه دشمن» یکی از کتاب های ستایش برانگیز عرصه فوتبال است. سایمون کوپر، خبرنگار انگلیسی به 22 کشور جهان سفر می کند و تاریخ فوتبال رادر بازی های تاثیرگذار و جنجالی مرور می کند. در این کتاب فوتبال پا از یک «بازی» فراتر می گذارد و در مقاطعی حتی پا به عرصه نبردهای بین المللی و صحنه های سیاسی می گذارد: «دو روز پس از اینکه وارد بوینس آیرس شدم، آرژانتین به مصاف برزیل رفت. مسابقه رسما صدمین سالگرد فدراسیون فوتبال آرژانتین را جشن می گرفت، ولی دلیل اصلی شادی مردم، بازگشت دیه گو مارادونا به تیم ملی برای اولین بار پس از محرومیتش به خاطر استعمال کوکائین بود... در ورزشگاه سروصدای زیادی برای بازی مقابل برزیل به پا شده بود. در پاسخ به شعار «اگر نپری، انگلیسی هستی» (اشاره به جنگ آرژانتین و انگلیس بر سر جزایر فالکلند)، نیمی از جمعیت به پرواز درمی آمدند، اما به من گفتند اکثر اوقات آنها فقط این آواز را می خواندند: برزیلی ها، برزیلی ها/ چقدر بدبخت به نظر می رسید/ مارادونا آرژانتینی است/ و از پله بهتر است». در این کتاب جزییات دوستی ها، خصومت ها، پیشینه برخی شعارها و جنجال های تاریخی فوتبال، همگی حضور دارند. کوپر با فوتبالیست ها، هواداران، خبرنگارها و حتی سیاستمدارهای زیادی در سراسر جهان صحبت می کند؛ در آمریکا، اروپا و آفریقا و خاورمیانه و کشورهای دور و نزدیک. او می خواهد تاثیر فوتبال بر سیاست و فرهنگ کشورها را دریابد. مصاحبه های دردسرساز و ممنوعه ترتیب می دهد، به برنامه های گروه های تروریستی سرک می کشد، اطلاعات عجیب و غریب از گروه های مافیایی و دست های نامرئی فوتبال کشف می کند و کتابش را در بازه زمانی حدود یک سال شکل می دهد. سایمون کوپر نشان می دهد فوتبال برای بازیکنان و هواداران و حتی سیاستمداران تنها یک بازی نیست، بلکه بسیار فراتر از چیزی است که ما به نام فوتبال می شناسیم. این کتاب با ترجمه عادل فردوسی پور، یکی از بهترین کتاب هایی است که در جهان در زمینه فوتبال نوشته شده.");
                startActivity(intent);
            }
        });
        imgbook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "زندگینامه من");
                intent.putExtra("img", R.drawable.zandeghiname);
                intent.putExtra("namefile", "My Autobiography.pdf");
                intent.putExtra("fileUrll", "http://media.specialolympics.org/soi/files/sports/Football/e63t2llj/Teaching.pdf");
                intent.putExtra("detail", "کتاب سرمربی سابق شیاطین سرخ در 320 صفحه قطع وزیری که شامل 25 فصل پرهیجان و همچنین بخش آلبوم تصاویر رنگی است،با استقبال مخاطبان هم روبه رو شد.  این کتاب پر از رمز و رازهای دنیای شخصی و فوتبالی بازیکنان و مربیان مشهور جهان است که خواندن آن همان قدر که برای جوانان فوتبال دوست ایرانی جالب توجه خواهد بود، برای مربیان ایرانی هم بسیار مفید و حائز اهمیت است.  دلایل اخراج و شکافتن ابروی بکهام»، «دلایل اخراج روی کین و یاپ استام»، «دلایل مانایی و تمام نشدنی بودن رایان گیگز»، «عوامل پیشرفت کریس رونالدو»، «دلایل شکست منچستر از بارسلونا در دو فینال لیگ قهرمانان»، «مقایسه دقیق رونالدو و مسی از زبان فرگوسن و اشمایکل»، «ماجراهای درگیری رونی و رونالدو در جام جهانی 2010»، «چرایی عدم قبول مربیگری تیم ملی انگلیس از سوی فرگوسن»، «خصوصیات منحصر به فرد کارلوس کیروش از زبان فرگوسن و دیگر بزرگان فوتبال»، «محبوبیت سلطان اولدترافورد؛ اریک کانتونا در نزد هواداران»، «فن نیستلروی، یک بازیکن معمولی اما یک گلزن مادرزاد»، «پل اسکولز، بهترین هافبک تاریخ انگلیس»، «یک شب در لندن، جدال فینال لیگ قهرمانان با چلسی» و «چرخ و فلک بارسلونا، نابودکننده بازی هر تیمی» از فصل های این کتاب به شمار می آیند.");
                startActivity(intent);
            }
        });
        imgbook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "قوانین بازی فوتبال");
                intent.putExtra("img", R.drawable.laws);
                intent.putExtra("fileUrll", "https://img.fifa.com/image/upload/datdz0pms85gbnqy4j3k.pdf");
                intent.putExtra("namefile", "Lows of the Game.pdf");
                intent.putExtra("detail", "فوتبال بزرگترین ورزش روی زمین است. این بازی در هر کشور و بسیاری از کشورها پخش می شود . سطوح مختلف قوانین بازی در کل فوتبال در کل یکسان است .  در تمام دنیا از جام جهانی تا بازی بین جوانان و کودکان در یک روستای دور افتاده باید قوانین یکسان در هر مسابقه در هر کشور ، شهر و روستا در سراسر جهان نقطه قوت قابل توجهی است که باید حفظ شود این همچنین فرصتی است که باید از آن استفاده شود . همه جا فوتبال خوب است. فوتبال باید قوانینی داشته باشد که بازی را \"عادلانه\" به عنوان پایه اساسی آن حفظ کند . زیبایی \"بازی زیبا\" عادلانه بودن آن است . این یک ویژگی حیاتی است . بهترین مسابقات آنهایی است که بازیکنان با احترام به یکدیگر بازی می کنند و به تصمیمات مسئولان مسابقه و قوانین آن احترام میگذارند . یکپارچگی قوانین و داورانی که آنها را اعمال می کنند ، همیشه باید محافظت شده باشد و مورد احترام است. همه صاحبان قدرت ، به ویژه مربیان و تیم کاپیتان ها ، در قبال بازی مسئولیت واضحی دارند که به مقامات مسابقه و تصمیمات آنها احترام بگذارند .");
                startActivity(intent);
            }
        });
        imgbook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "آموزش فوتبال");
                intent.putExtra("img", R.drawable.tutorials);
                intent.putExtra("fileUrll", "https://www.tutorialspoint.com/football/football_tutorial.pdf");
                intent.putExtra("namefile", "FootballTutorialspoint.pdf");
                intent.putExtra("detail", "کتاب آموزش فوتبال با مشاهده بازی های امروزی در گوشه و کنار جهان و طرافداران بیش از حد آن عرضه شده است . کتاب آموزش فوتبال در رابطه به اینکه ورزش فوتبال در وضعیت خوبی بوده و تمامی جهان را در برگرفته است و محبوبیت فراوانی دارد طراحی شده است . ملت های جوان در حال پیشرفت در فوتبال هستند و با کشورهای صاحب فوتبال مسابقه می دهند. فوتبال در تاکتیک، پیشرفت و توسعه فراوانی یافته است، بازی سریع تر شده است و تعداد گلهای به ثمر رسیده در هر بازی افزایش یافته و بازیکنان باهوش خود را بیش از پیش مطرح کرده اند اما هنوز بعضی اعتقاد دارند که مهارتهای تکنیکی بازیکن، آگاهی های تاکتیکی از بازی و شرایط ذهنی بازیکنان می تواند بیش از این توسعه یابد.سطح  فوتبال پیشرفت کرده است . تمرینات فیزیکی، سرعتی و قدرتی افزایش یافته اند اما تاکتیک ها همان تاکتیک های قدیم است و در این جاست که مهارتهای تکنیکی انفرادی تعیین کننده هستند. به عبارتی دیگر فوتبال باید جنبه های تماشایی و هیجان آور این بازی را در آینده نیز همچنان تامین کند. ما باید روشی سختگیرانه در رابطه با آموزش فوتبال در پیش بگیریم و در همان حال افق دید خود را توسعه دهیم. فوتبال باید یک مدرسه زندگی به تمام معنا باشد نه تنها در پرورش بازیکنان حرفه ای بلکه به عنوان واسطه ای برای کمک به جوانان تا شخصیت آنان آگاهی های عمومی ، فرهنگ و مهارت های تاثیر گذار اجتماعی به طور کامل شکوفا شود. به مربیان آینده شرح وظایفی در مورد پرورش بازیکنان واگذار خواهد شد تا بتوانند استعدادهای پنهان بازیکنان جوان را کشف کنند. در این راه بازیکنان جوان اجازه می یابند تا آزادانه توانائی های فردی خود را بروز دهند.");
                startActivity(intent);
            }
        });
        imgbook5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "روزی روزگاری فوتبال");
                intent.putExtra("img", R.drawable.ruziruzeghari);
                intent.putExtra("fileUrll", "https://www.streetfootballworld.org/sites/default/files/football3%20Handbook.pdf");
                intent.putExtra("namefile", "Football3 handbook.pdf");
                intent.putExtra("detail", "روزی روزگاری فوتبال یکی از آثار تالیفی بسیار خوب در زمینه فوتبال است که حمیدرضا صدر تلاش کرده نگاهی جامعه شناسانه در این کتاب به فوتبال داشته باشد. فوتبال در این کتاب تمام پهنه های جغرافیایی را طی می کند؛ از زمین های خاکی تهران تا ترکیه، از ایتالیا و اسپانیا تا آلمان و انگلیس، از برزیل و آرژانتین تا مکزیک. حمیدرضا صدر در این کتاب از فرهنگی به فرهنگ دیگر می رود، فوتبال و مردم، فوتبال و سیاست و فوتبال و زندگی را در نگاهی موشکافانه به هم پیوند می زند و از پدیده ای سخن می گوید که دل های مردم سراسر دنیا را بی بهانه و با بهانه به هم وصل کرده است. او این کتاب را نمایشگر رویارویی شور مردم و قدرت طلبی سیاست پیشگان حول مستطیل سبز و دایره سفید می داند؛ دایره ای که در این مستطیل از حرکت باز نمی ایستد و بی وقفه می چرخد. قلم حمیدرضا صدر در «روزی روزگاری فوتبال»، بازتابنده شیفتگی مهارناپذیر آدم هایی است که نمی توانند دل هایشان را از فوتبال بکنند؛ توصیف کننده برق چشم های مشتاقی که نمی توانند مستطیل سبز را تماشا نکنند: «در پاییز 1997 چه حوادثی توجه جهانیان را جلب کرد؟ سرقت 17 میلیون دلاری از بانک لومیس فراگو در کارولینای شمالی؟ قتل عام 43 نفر در الجزایر؟ خاکسپاری بقایای جسد ارنستو چه گوارا در سانتا کلارا در کوبا؟ محروم شدن مایکل شوماخر به دلیل تخلف حین مسابقه؟ ولی پاییز 1997 برای ایرانیان با نبرد پرشور استرالیا در آخرین مسابقه برای راهیابی به جام جهانی فرانسه گره خورد، با کسب جواز راهیابی به جام جهانی... نبرد ملبورن، نبرد تاریخی فوتبال ایران شد. نبرد ملبورن در هشتم آذر 1376، در استادیوم  ام اس جی ، پر تب و تاب ترین خاطره ایرانیان آن عصر شد... ویرا پس از بازی گفت: نشسته بودم و دعا می خواندم. حمیدرضا صدر چهره شناخته شده عرصه فوتبال و تحلیلگر نام آشنای سالیان دراز این ورزش، از تجربیات و اطلاعات خود استفاده می کند و کتابی تاثیرگذار می نویسند به نام : روزی روزگاری فوتبال .");
                startActivity(intent);
            }
        });
        more_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityMoreBook.class);
                startActivity(intent);


            }
        });


        imgmusic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "سرود باشگاه منچستریونایتد ");
                intent.putExtra("img", R.drawable.manutdg);
                intent.putExtra("namefile", "gloryglory_manunited.mp3");
                intent.putExtra("fileUrll", "https://ts1.tarafdari.com/contents/user225720/content-sound/manchester-united-glory-glory-song.mp3");
                intent.putExtra("detail", "ترجمه ی آهنگ گلوری گلوری من یونایتد :  افتخار،افتخار،من یونایتد   افتخار،افتخار،من یونایتد    افتخار،افتخار،من یونایتد   به عنوان یک قرمز پوش قدم بردار به سوی جلو   درست مانند پسران  بازبی(سرمربی سابق منچستریونایتد) در روز هایی که رفتند    ما پرچم های قرمز را بالا نگه خواهیم داشت   شما می توانید خودتان را از دور به خوبی ببینید  شما می توانید آهنگ باشگاه را با افتخار بشنوید   یونایتد! من یونایتد     ما پسرانی هستیم در لباس قرمز و روبه سوی ومبلی داریم   ومبلی، ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   ومبلی،ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   در سال 77 تامی دوچارتی ما را قهرمان کرد     رون اتکینسون در سال 83 افتخار را برای ما آورد     همه می دانند ما که هستیم   ما آهنگ دوری دی به نام Que Sera Sera را خواهیم خواند   یونایتد! من یونایتد   ما پسرانی هستیم در لباس قرمز و روبه سوی ومبلی داریم   ومبلی، ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   ومبلی،ومبلی   ما من یونایتد معروف هستیم و به سوی ومبلی قدم برمی داریم   افتخار،افتخار،من یونایتد   افتخار،افتخار،من یونایتد   افتخار،افتخار،من یونایتد   به عنوان یک قرمز پوش قدم بردار به سوی جلو   به عنوان یک قرمز پوش قدم بردار به سوی جلو   به عنوان یک قرمز پوش قدم بردار به سوی جلو");
                startActivity(intent);
            }
        });
        imgmusic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "سرود باشگاه لیورپول");
                intent.putExtra("img", R.drawable.liverpoolg);
                intent.putExtra("namefile", "ynwa_liverpool.mp3");
                intent.putExtra("fileUrll", "https://ts1.tarafdari.com/contents/user147269/news/liverpool_fc_-_youll_never_walk_alone_-_best_version_-_listen_or_download_0.mp3");
                intent.putExtra("detail", "ترجمه ی آهنگ تو تنها قدم نخواهی زد لیورپول : زمانی که از طوفان گذر می کنی     سرت را بالا بگیر     و از سیاهی نترس     در پایان این طوفان    آسمانی طلایی است و    چکاوکی به زیبایی می خواند     در باد به   راهت ادامه بده     زیز باران به راهت ادامه بده    اگر خسته شدی و رویاهایت در آستانه نابودی قرار گرفت     ادامه بده، ادامه بده    با امیدی در قلب    و تو هیچگاه تنها قدم نخواهی زد      تو هیچگاه قدم نخواهی زد    ادامه بده، ادامه بده      با امیدی در قلبت     و تو هیچگاه تنها قدم نخواهی زد    تو هیچگاه قدم نخواهی زد ");
                startActivity(intent);

            }
        });
        imgmusic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "سرود باشگاه رئال مادرید");
                intent.putExtra("img", R.drawable.realg);
                intent.putExtra("namefile", "hala_madrid.mp3");
                intent.putExtra("fileUrll", "https://ts2.tarafdari.com/contents/user437331/content-sound/pxiyfu0eygzt128.mp3");
                intent.putExtra("detail", "ترجمه ی آهنگ هالا مادرید : تاریخ را نوشتید ، اینک آماده اید برای در تاریخ ماندن    چرا که کسی جرئت ندارد ایستادگی کند در برابر اراده تان برای بردن  از بدو طلوع ستاره ها ، چامارتین  قدیمی من    مجذوب کرد ما را از دور و نزدیک گرد هم    جامه ات را به تن می کنم ، به قلبم چفتش می کنم  روزهایی که بازی داری ، از خود بیگانه می شوم    لاسائتا می دود ، رئال مادرید من می تازد    می جنگم ، زیبا هستم ، این سرود را آموختم:    مادرید ، مادرید ، مادرید ، زنده باد مادرید ،   همین و بس ، همین و بس ، زنده باد مادرید    تاریخ را نوشتید ، اینک آماده اید برای در تاریخ ماندن    چرا که هیچ کس یارای ایستادگی ندارد برابر اراده تان را برای بردن  از بدو طلوع ستاره ها ، چامارتین قدیمی من   مجذوب کرد ما را از دور و نزدیک گرده    مادرید ، مادرید ، مادرید ، زنده باد مادرید ،   همین و بس ، همین و   بس ، زنده باد مادرید");
                startActivity(intent);
            }
        });
        imgmusic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "سرود باشگاه بارسلونا");
                intent.putExtra("img", R.drawable.barcag);
                intent.putExtra("namefile", "barca.mp3");
                intent.putExtra("fileUrll", "https://ts1.tarafdari.com/contents/user196638/content-sound/barcelona-song.mp3");
                intent.putExtra("detail", "ترجمه  ی آهنگ بارسا : همه استادیوم   همزمان فریاد می زنند   ما هواداران آبی و اناری ها هستیم   فرقی نمی کند اهل کجا باشیم   جنوبی باشیم یا شمالی   اکنون ما همه موافقیم، همه موافقیم،   که یک پرچم ما را در برادری متحد می کند.    پرچم آبی و اناری در باد در اهتزاز است     یک دلاور فریاد می زند   ما نامی داریم که همه آن را می شناسند:    بارسا، بارسا، بااارسا!    بازیکنان، هواداران    اگر متحد باشیم قدرتمندیم.      ما سالها سختکوشانه کار کردیم،     گلهای بسیاری زدیم    و ما نشان داده ایم، نشان داده ایم،    که هیچ کس هیچ گاه نمی تواند ما را بشکند.   پرچم آبی و اناری در باد در اهتزاز است   یک دلاور فریاد می زند   ما نامی داریم که همه آن را می شناسند:  بارسا، بارسا، بااارسا!");
                startActivity(intent);
            }
        });
        imgmusic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);

                intent.putExtra("title", "سرود باشگاه بایرن مونیخ");
                intent.putExtra("img", R.drawable.bayerng);
                intent.putExtra("namefile", "miasanmia.mp3");
                intent.putExtra("fileUrll", "https://ts1.tarafdari.com/contents/user66769/content-sound/16_hino_bayern_munchen.mp3");
                intent.putExtra("detail", "ترجمه آهنگ بایرن مونیخ : کدوم تیمه فوتبال مونیخه که همه جا طرفدار داره؟   کدوم تیمه که همه رکوردهای آلمان تو دستشه؟    کدوم تیمه که تموم جامها رو برده؟  کدوم تیمه که همه تیمهای بوندسلیگا رو شکست داده؟   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…   اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،   بله، این راهی است که بوده و همیشه خواهد بود…   اونجا کجاست که براش فالگوش وایمیسن و هرروز براش جاسوس میفرستن؟!   خبرنگارا کجان همیشه؟   نظرا همه به کجاست؟   همیشه راجع به کجا بحث میکنن؟   برای بازی کی همه ی بلیط ها فروخته میشه؟    کی به هوادارای حریف فشار زیادی وارد میکنه؟   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…    اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،   بله، این راهی است که بوده و همیشه خواهد بود…  در بوندسلیگا یا جام حذفی یا حتی لیگ قهرمانان اوروپا،   چیزی زیبا تر از پیروز شدن بایرن وجود داره؟   اینجا زندگی، عشق و خوشبختی هست برای همین هم مونیخه من  برای ابد بهترینه توی آلمان…   اف سی بایرن، ستاره جنوب،   شما هیچوقت نمیتونید برای شکست ما یکدست بشید چون ما در شرایط خوب و بد با هم هستیم…  اف سی بایرن، قهرمان آلمان،   بله، این تیم فوتبال منه،  بله، این راهی است که بوده و همیشه خواهد بود");
                startActivity(intent);
            }
        });
        moreMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityMoreMusic.class);
                startActivity(intent);

            }
        });

        //create listview
        gvVideo = findViewById(R.id.gvVideo);

        //create data
        ArrayList<More> data = database();

        //create adaptor
        CustomAdaptorVideo customAdaptorVideo = new CustomAdaptorVideo(this, data);

        //bind
        gvVideo.setAdapter(customAdaptorVideo);

        //click
        gvVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                More more = (More) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, MainActivityDetails.class);
                intent.putExtra("title", more.getTitle());
                intent.putExtra("img", more.getImg());
                intent.putExtra("fileUrll", more.getFileUrll());
                intent.putExtra("namefile", more.getNamefile());
                intent.putExtra("detail", more.getDetail());
                startActivity(intent);
            }
        });
        moreVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityMoreVideo.class);
                startActivity(intent);
            }
        });

        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityDaste.class);
                startActivity(intent);
            }
        });
        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "قسمت دانلود ها در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "قسمت تنظیمات در دست ساخت میباشد", Toast.LENGTH_SHORT).show();
            }
        });
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityProfile.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<More> database() {
        ArrayList<More> result = new ArrayList<>();
        result.add(new More(R.drawable.italy_ger, "آلمان - ایتالیا", "ger_ity.mp4", "https://ts5.tarafdari.com/contents/user160399/video/italy_2-0_germany_-_germany_world_cup_-_2006.mp4", "چهارم جولای 2006 و دیدار حساس آلمان و ایتالیا از مرحله نیمه نهایی جام جهانی ؛ بازی در ورزشگاه وستفالن شهر دورتموند (که اکنون با نام سیگنال ایدونا پارک شناخته می شود) برگزار می شد. آلمانِ میزبان در این مرحله باید با حریف سرسختی همچون ایتالیا روبرو شود. آلمان ها که با حذف آرژانتین به این مرحله رسیدند اصلا دلشان نمیخواهد در حضور هوادارنشان شکست بخورند و به کمتر قهرمانی قانع نیستند . ایتالیای جذاب مارچلو لیپی هم با ستاره هایی مثل بوفون ، دلپیرو ، توتی و کاناوارو به دنبال قهرمانی برای این نسل طلایی هستند . "));
        result.add(new More(R.drawable.barca_liver, "لیورپول - بارسلونا", "barca_liver.mp4", "https://ts2.tarafdari.com/contents/user137370/video/liverpool_4_0_barcelona_hl_ucl_2019_semifinal.mp4", "در یکی از بازی های برگشت دور نیمه نهایی لیگ قهرمانان اروپا دو تیم فوتبال لیورپول و بارسلونا در شهر لیورپول و ورزشگاه آنفیلد به مصاف یکدیگر رفتند. بارسلونا با حذف لیون و منچستریونایتد به این مرحله رسیده بود و لیورپول با شکست بایرن مونیخ و پورتو .  بازی رفت این دو تیم در نیوکمپ با درخشش مسی و پیروزی 3 بر 0 کاتالان ها به پایان رسیده بود. در این بازی محمد صلاح و سادیو مانه ستارگان لیورپول غایب بودند و شاید کسی تصوری برای بازگشت لیورپول نبود ولی در آنفیلد غیر ممکن ها ممکن میشود . بارسلونا هم بعد از حذف تلخ فصل پیششان برابر رم اصلا دوست ندارند این اتفاق تکرار شود ."));
        result.add(new More(R.drawable.mu_real, "منچستریونایتد - رئال مادرید", "manutd-real.mp4", "https://ts5.tarafdari.com/contents/user160399/video/man_united_4-3_real_madrid_-_ucl_-_2002-03.mp4", "23 آوریل سال 2003، دیدار برگشت مرحله یک چهارم نهایی لیگ قهرمانان اروپا بین تیم های منچستریونایتد و رئال مادرید در حضور 66 هزار تماشاگر حاضر در ورزشگاه اولدترافورد برگزار شد. شیاطین سرخ در انتهای فصل 2002/03 با کسب 83 امتیاز و بالاتر از آرسنال 78 امتیازی به مقام قهرمانی لیگ برتر انگلستان دست یافتند. رئال مادرید دلبوسکه نیز در این فصل با کسب 78 امتیاز به مقام قهرمانی لالیگا نائل شد. خلاصه ای از این دیدار جذاب و تماشایی را می توانید مشاهده کنید. دیدار رفت دو تیم در سانتیاگو برنابئو با برتری 3-1 رئالی ها به پایان رسید و شیاطین سرخ در صدد بازگشت هستند . در این دیدار شاهد رویایی ستارگانی مانند رونالدو نازاریو ، بکام ، کاسیاس ، سولسشر ، زیدان ، اسکولز ، رائول ، فن نیستروی ، گوتی و گیگز هستیم ."));
        result.add(new More(R.drawable.chelsea_liver, "چلسی - لیورپول", "che-liv.mp4", "https://ts5.tarafdari.com/contents/user7410/video/chelsea204-420liverpool20_20frank20lampard20double20puts20chelsea20through20_20champions20league20highlights.mp4", "در لیگ قهرمانان اروپا در فصل 2009 دو تیم لیورپول و چلسی در مرحله یک چهارم نهایی تقابل تمام انگلیسی را به وجود آوردند . بازی رفت دو تیم در آنفیلد با برتری 3-1 شاگردان گاس هیدینگ همراه بود . برنده در دور نیمه نهایی به مصاف بارسای پپ خواهد رفت . لیورپول رافا بنتیز که در لیگ در کورس قهرمانی با منچستریونایتد هستند به دنبال کسب دوگانه میباشند . در نهایت در پایان این فصل لیورپول به مقام دوم لیگ رسید و چلسی سوم شد . این دیدار خاطره و پر گل را خواهیم دید . "));
        result.add(new More(R.drawable.barca_real, "رئال مادرید - بارسلونا", "barca_real.mp4", "https://ts5.tarafdari.com/contents/user306454/video/madrid.vs_.barc_.2009.2_6.mp4", "سال 2009 دو تیم رئال مادرید و بارسلونا در ورزشگاه سانتیاگو برنابئو شهر مادرید به مصاف هم رفتند. در این مسابقه شاگردان پپ گواردیولا موفق شدند یکی از سنگین ترین شکست های تاریخ رئال مادرید را رقم بزنند و رقیب دیرینه ی خود را تحقیر کنند. بارسلونا در این فصل موفق به کسب سه گانه و شاهد دوران اوج مسی ، اتوو ، هانری ، ژاوی و اینیستا هستیم ."));
        result.add(new More(R.drawable.mu_juve, "یوونتوس - منچستریونایتد", "mu_juve.mp4", "https://ts5.tarafdari.com/contents/user306454/video/juve.vs_.utd1999.mp4", "در این ویدیو مروری خواهیم داشت به بازی خاطره انگیز یوونتوس و منچستریونایتد در لیگ قهرمانان اروپا در دور برگشت مرحله نیمه نهایی فصل 1998/99 که در بازی رفت دو تیم در اولدترافورد با تساوی یک یک به پایان رسید. نتیجه که مطابق میل شاگردان آنجلوتی بود و آنها میتوانند با برتری مقابل منچستریونایتد حریف بایرن مونیخ در فینال نیوکمپ شود . منچستریونایتد فرگوسن هم با داشتن ستاره هایی مانند بکام ، گیگز ، اسکولز و اشمایکل بعد از قهرمانی در لیگ و جام حذفی رویای کسب سه گانه را دارند ."));

        return result;
    }

    private void init() {
        imgbook1 = findViewById(R.id.imgbook1);
        imgbook2 = findViewById(R.id.imgbook2);
        imgbook3 = findViewById(R.id.imgbook3);
        imgbook4 = findViewById(R.id.imgbook4);
        imgbook5 = findViewById(R.id.imgbook5);
        tvbook1 = findViewById(R.id.tvbook1);
        tvbook2 = findViewById(R.id.tvbook2);
        tvbook3 = findViewById(R.id.tvbook3);
        tvbook4 = findViewById(R.id.tvbook4);
        tvbook5 = findViewById(R.id.tvbook5);
        more_book = findViewById(R.id.more_book);

        imgmusic1 = findViewById(R.id.imgmusic1);
        imgmusic2 = findViewById(R.id.imgmusic2);
        imgmusic3 = findViewById(R.id.imgmusic3);
        imgmusic4 = findViewById(R.id.imgmusic4);
        imgmusic5 = findViewById(R.id.imgmusic5);
        tvmusic1 = findViewById(R.id.tvmusic1);
        tvmusic2 = findViewById(R.id.tvmusic2);
        tvmusic3 = findViewById(R.id.tvmusic3);
        tvmusic4 = findViewById(R.id.tvmusic4);
        tvmusic5 = findViewById(R.id.tvmusic5);
        moreMusic = findViewById(R.id.moreMusic);

        moreVideo = findViewById(R.id.moreVideo);

        btndate = findViewById(R.id.btndate);
        btndownload = findViewById(R.id.btndownload);
        btnsetting = findViewById(R.id.btnsetting);
        btnprofile = findViewById(R.id.btnprofile);


    }
}









