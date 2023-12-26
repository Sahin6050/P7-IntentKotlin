package com.sahin.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sahin.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Activity Lifecycle -> Aktivite Yaşam Döngüsü
        println("onCreate Executed")

    }

    override fun onStart() {
        //binding.nameText.setText("")
        println("onStart Executed")
        super.onStart()
    }

    override fun onResume() {
        println("onResume Executed")
        super.onResume()
    }

    override fun onPause() {
        println("OnPause Executed")
        super.onPause()
    }

    override fun onStop() {
        println("onStop Executed")
        super.onStop()
    }

    override fun onDestroy() {
        println("onDestroy Executed")
        super.onDestroy()
    }
    fun next(view : View){
        // İntent yapısı -> Aktiviteler arası geçişi ve veri aktarımını sağlar.

        val intent = Intent(this@MainActivity,MainActivity2::class.java)
        val myName = binding.nameText.text.toString()
        intent.putExtra("myName",myName)
        startActivity(intent)
        finish()


    }
}