package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var call: Button = findViewById(R.id.Call)

        call.setOnClickListener{
           var eTv: EditText = findViewById(R.id.eTv)
           var number = eTv.text.toString()

           var inTent = Intent(Intent.ACTION_CALL)
           inTent.data = Uri.parse("tel:" + number)
            startActivity(inTent)

        }
    }
}