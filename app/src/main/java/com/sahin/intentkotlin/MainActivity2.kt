package com.sahin.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sahin.intentkotlin.databinding.ActivityMain2Binding
import com.sahin.intentkotlin.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val myName = intent.getStringExtra("myName")
        binding.textView3.text = "Your Name : ${myName}"
    }
    fun previous(view : View){
        val intent = Intent(this@MainActivity2,MainActivity::class.java)
        startActivity(intent)


    }
}