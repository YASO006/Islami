package com.example.islami.ui.screens.fragments.quran

import RecyclerView.QuranList.MyAdapter
import RecyclerView.QuranList.SurahListContents
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import com.example.islami.ui.screens.main.SuraDetailsActivity

class QuranFragment : Fragment() {

    companion object{
        const val SURA_KEY = "sura"
    }

    lateinit var quranList : RecyclerView
    var data : ArrayList<SurahListContents> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        quranList = view.findViewById(R.id.quranList)

        enteringDataInArrayList()


        var adapter = MyAdapter(R.layout.custom_quran_list,data){ surah ->
            var intent = Intent(activity, SuraDetailsActivity::class.java)
            intent.putExtra(SURA_KEY,surah)
            startActivity(intent)

        }

        quranList.adapter = adapter

    }

    private fun enteringDataInArrayList() {

        val surahName : ArrayList<String>  = arrayListOf(
            "Al-Fatiha",
            "Al-Baqarah",
            "Aal-E-Imran",
            "An-Nisa'",
            "Al-Ma'idah",
            "Al-An'am",
            "Al-A'raf",
            "Al-Anfal",
            "At-Tawbah",
            "Yunus",
            "Hud",
            "Yusuf",
            "Ar-Ra'd",
            "Ibrahim",
            "Al-Hijr",
            "An-Nahl",
            "Al-Isra",
            "Al-Kahf",
            "Maryam",
            "Ta-Ha",
            "Al-Anbiya",
            "Al-Hajj",
            "Al-Mu'minun",
            "An-Nur",
            "Al-Furqan",
            "Ash-Shu'ara",
            "An-Naml",
            "Al-Qasas",
            "Al-Ankabut",
            "Ar-Rum",
            "Luqman",
            "As-Sajda",
            "Al-Ahzab",
            "Saba",
            "Fatir",
            "Ya-Sin",
            "As-Saffat",
            "Sad",
            "Az-Zumar",
            "Ghafir",
            "Fussilat",
            "Ash-Shura",
            "Az-Zukhruf",
            "Ad-Dukhan",
            "Al-Jathiya",
            "Al-Ahqaf",
            "Muhammad",
            "Al-Fath",
            "Al-Hujurat",
            "Qaf",
            "Adh-Dhariyat",
            "At-Tur",
            "An-Najm",
            "Al-Qamar",
            "Ar-Rahman",
            "Al-Waqi'a",
            "Al-Hadid",
            "Al-Mujadila",
            "Al-Hashr",
            "Al-Mumtahina",
            "As-Saff",
            "Al-Jumu'a",
            "Al-Munafiqun",
            "At-Taghabun",
            "At-Talaq",
            "At-Tahrim",
            "Al-Mulk",
            "Al-Qalam",
            "Al-Haqqah",
            "Al-Ma'arij",
            "Nuh",
            "Al-Jinn",
            "Al-Muzzammil",
            "Al-Muddathir",
            "Al-Qiyamah",
            "Al-Insan",
            "Al-Mursalat",
            "An-Naba'",
            "An-Nazi'at",
            "Abasa",
            "At-Takwir",
            "Al-Infitar",
            "Al-Mutaffifin",
            "Al-Inshiqaq",
            "Al-Buruj",
            "At-Tariq",
            "Al-A'la",
            "Al-Ghashiyah",
            "Al-Fajr",
            "Al-Balad",
            "Ash-Shams",
            "Al-Lail",
            "Ad-Duha",
            "Ash-Sharh",
            "At-Tin",
            "Al-Alaq",
            "Al-Qadr",
            "Al-Bayyina",
            "Az-Zalzalah",
            "Al-Adiyat",
            "Al-Qari'a",
            "At-Takathur",
            "Al-Asr",
            "Al-Humazah",
            "Al-Fil",
            "Quraysh",
            "Al-Ma'un",
            "Al-Kawthar",
            "Al-Kafirun",
            "An-Nasr",
            "Al-Masad",
            "Al-Ikhlas",
            "Al-Falaq",
            "An-Nas"






        )
        val surahNameInArabic  : ArrayList<String> = arrayListOf(
            "الفاتحه",
            "البقرة",
            "آل عمران",
            "النساء",
            "المائدة",
            "الأنعام",
            "الأعراف",
            "الأنفال",
            "التوبة",
            "يونس",
            "هود",
            "يوسف",
            "الرعد",
            "إبراهيم",
            "الحجر",
            "النحل",
            "الإسراء",
            "الكهف",
            "مريم",
            "طه",
            "الأنبياء",
            "الحج",
            "المؤمنون",
            "النّور",
            "الفرقان",
            "الشعراء",
            "النّمل",
            "القصص",
            "العنكبوت",
            "الرّوم",
            "لقمان",
            "السجدة",
            "الأحزاب",
            "سبأ",
            "فاطر",
            "يس",
            "الصافات",
            "ص",
            "الزمر",
            "غافر",
            "فصّلت",
            "الشورى",
            "الزخرف",
            "الدّخان",
            "الجاثية",
            "الأحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "ق",
            "الذاريات",
            "الطور",
            "النجم",
            "القمر",
            "الرحمن",
            "الواقعة",
            "الحديد",
            "المجادلة",
            "الحشر",
            "الممتحنة",
            "الصف",
            "الجمعة",
            "المنافقون",
            "التغابن",
            "الطلاق",
            "التحريم",
            "الملك",
            "القلم",
            "الحاقة",
            "المعارج",
            "نوح",
            "الجن",
            "المزّمّل",
            "المدّثر",
            "القيامة",
            "الإنسان",
            "المرسلات",
            "النبأ",
            "النازعات",
            "عبس",
            "التكوير",
            "الإنفطار",
            "المطفّفين",
            "الإنشقاق",
            "البروج",
            "الطارق",
            "الأعلى",
            "الغاشية",
            "الفجر",
            "البلد",
            "الشمس",
            "الليل",
            "الضحى",
            "الشرح",
            "التين",
            "العلق",
            "القدر",
            "البينة",
            "الزلزلة",
            "العاديات",
            "القارعة",
            "التكاثر",
            "العصر",
            "الهمزة",
            "الفيل",
            "قريش",
            "الماعون",
            "الكوثر",
            "الكافرون",
            "النصر",
            "المسد",
            "الإخلاص",
            "الفلق",
            "الناس"

        )
        val ayaNumber: ArrayList<String> = arrayListOf(
            "7", "286", "200", "176", "120", "165", "206", "75", "129", "109", "123", "111",
            "43", "52", "99", "128", "111", "110", "98", "135", "112", "78", "118", "64",
            "77", "227", "93", "88", "69", "60", "34", "30", "73", "54", "45", "83", "182",
            "88", "75", "85", "54", "53", "89", "59", "37", "35", "38", "29", "18", "45",
            "60", "49", "62", "55", "78", "96", "29", "22", "24", "13", "14", "11", "11",
            "18", "12", "12", "30", "52", "52", "44", "28", "28", "20", "56", "40", "31",
            "50", "40", "46", "42", "29", "19", "36", "25", "22", "17", "19", "26", "30",
            "20", "15", "21", "11", "8", "5", "19", "5", "8", "8", "11", "11", "8", "3",
            "9", "5", "4", "6", "3", "6", "3", "5", "4", "5", "6"
        )

        for(i in 0 until surahName.size){
            var surahNumber = i+1
            data.add(SurahListContents(surahName.get(i),ayaNumber.get(i),surahNameInArabic.get(i),surahNumber.toString()))
        }
    }




}