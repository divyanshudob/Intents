package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var searchBtn = findViewById<Button>(R.id.searchbtn)
        var eTv = findViewById<EditText>(R.id.eTv)

        searchBtn.setOnClickListener {

            var inten: Intent = Intent(Intent.ACTION_VIEW)
            var url  = eTv.text.toString()
            var Url = "http://www.$url.com"
            inten.data = Uri.parse(Url)
            startActivity(inten)
        }

    }
}