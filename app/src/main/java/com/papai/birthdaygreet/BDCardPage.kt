package com.papai.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bdcard_page.*

class BDCardPage : AppCompatActivity() {
    companion object{
        const val NAME_EX = "name_ex"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bdcard_page)

        val name = intent.getStringExtra(NAME_EX)
        bdtext.text = "Happy Birthday \n$name"

        backb.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}