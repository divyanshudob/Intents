package com.example.intents

import android.content.Intent
import android.net.Uri
import android.net.Uri.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.DialBtn)
        var eTv = findViewById<EditText>(R.id.PhoneNo)

        btn.setOnClickListener{
            var number = eTv.text.toString()
            var inTent = Intent(Intent.ACTION_DIAL)
            var uri = parse("tel:"+number)
            inTent.data = uri
            try{
                startActivity(inTent)
            }
            catch (s: SecurityException){
                Toast.makeText(this,"Error Occured",Toast.LENGTH_LONG).show()
            }
        }
    }
}