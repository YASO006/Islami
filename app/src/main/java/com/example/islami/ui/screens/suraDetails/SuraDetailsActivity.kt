package com.example.islami.ui.screens.main

import RecyclerView.QuranList.SurahListContents
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.islami.R
import com.example.islami.ui.screens.fragments.quran.QuranFragment

class SuraDetailsActivity : AppCompatActivity() {

    lateinit var surah : SurahListContents
    lateinit var surahArabic : TextView
    lateinit var surahEnglish : TextView
    lateinit var surahText : TextView
    lateinit var arrow : ImageView

    var surahNewArray = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sura_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            surah = intent.getSerializableExtra(QuranFragment.SURA_KEY,SurahListContents :: class.java)!!
        }else{
            surah = intent.getSerializableExtra(QuranFragment.SURA_KEY) as SurahListContents
        }

        surahEnglish.setText(surah.surahName)
        surahArabic.setText(surah.surahNameInArabic)
        readSurahFiles()


        initLestners()

    }

    private fun readSurahFiles() {
        val fileName = "${surah.SurahNumber}.txt"
        val assetsStream = assets.open("Suras/$fileName")
        val line = assetsStream.reader().readText()
        surahText.setText(line)

        




    }


    private fun initLestners() {
        arrow.setOnClickListener {
            finish()
        }
    }

    private fun initViews() {
        surahText = findViewById(R.id.surahText)
        surahArabic = findViewById(R.id.SurahArabic)
        surahEnglish = findViewById(R.id.SurahEnglish)
        arrow = findViewById(R.id.arrow)


    }


}