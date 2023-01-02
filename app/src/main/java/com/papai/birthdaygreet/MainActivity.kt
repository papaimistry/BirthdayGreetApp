package com.papai.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        creatbutton.setOnClickListener{
            val name=edit_name.editableText.toString()
            Toast.makeText(this,"The Name Is $name",Toast.LENGTH_LONG).show()

            val intent=Intent(this,BDCardPage::class.java)
            intent.putExtra(BDCardPage.NAME_EX ,name)
            startActivity(intent)
        }

    }
}