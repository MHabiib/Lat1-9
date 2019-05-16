package com.example.mymediafile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reminder.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var myFileHelper = FileHelper()
        save.setOnClickListener{
            myFileHelper.writeFile(pesan.text.toString(),this)
            pesan.text.clear()
            Toast.makeText(this,"Data Disimpan",Toast.LENGTH_SHORT).show()
        }
        read.setOnClickListener{
            isi.text = ""
            isi.text = myFileHelper.readFile(this)
        }*/

    makeReminder.setOnClickListener {
        val intent = Intent(this, ReminderActivity::class.java)
        startActivity(intent)
    }
    }
}
