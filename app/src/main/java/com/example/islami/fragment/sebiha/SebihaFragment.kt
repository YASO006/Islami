package com.example.islami.ui.screens.fragments.sebiha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.islami.R

class SebihaFragment : Fragment() {
    lateinit var sebihaBody : ImageView
    lateinit var tasbihCount : TextView
    lateinit var zeikr : TextView

    var i = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View  {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebiha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sebihaBody = view.findViewById(R.id.islami_sebiha)
        tasbihCount = view.findViewById(R.id.tasbihCount)
        zeikr = view.findViewById(R.id.zeikr)

        initClickListner()


    }

    private fun initClickListner() {
        sebihaBody.setOnClickListener {

            var arr : ArrayList<String> = arrayListOf("بسم اللة","الحمداللة","اللهم لك الحمد","اللهم لك الشكر","سبحان الله العظيم","سبحان ربي الاعلى")

            sebihaBody.animate().rotationBy(10f).setDuration(200).start()

            var count = Integer.parseInt(tasbihCount.text.toString())
            var flag = true
            count++

            while(count % 30 == 0){

                if(i < arr.size){
                    zeikr.text = arr.get(i)
                    i++
                }else{
                    i = 0
                    zeikr.text = arr.get(i)
                    i++
                }

                break



            }

            println("index i = $i")

            tasbihCount.text = count.toString()

        }





    }


}