package com.example.islami.ui.screens.main

import RecyclerView.QuranList.MyAdapter
import RecyclerView.QuranList.SurahListContents
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import com.example.islami.ui.screens.fragments.hadith.HadithFragment
import com.example.islami.ui.screens.fragments.quran.QuranFragment
import com.example.islami.ui.screens.fragments.sebiha.SebihaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var button : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
        onClickItem()

    }



    private fun initViews() {
        button = findViewById(R.id.navigationBar)
    }

    private fun onClickItem() {
        button.setOnItemSelectedListener {
            item ->
            when(item.itemId){

                R.id.quranTab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, QuranFragment())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.hadithTab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, HadithFragment())
                        .addToBackStack(null)
                        .commit()

                }

                R.id.radioTab -> {
                    Toast.makeText(baseContext,"Todo Task",Toast.LENGTH_SHORT).show()
                    return@setOnItemSelectedListener false
                }
                R.id.sebhaTab -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, SebihaFragment())
                        .addToBackStack(null)
                        .commit()

                }


            }
            return@setOnItemSelectedListener true



        }


    }




}