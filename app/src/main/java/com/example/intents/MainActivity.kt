package com.example.intents

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        var iV = findViewById<ImageView>(R.id.iV)

        btn.setOnClickListener{
             var inTent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
             startActivityForResult(inTent,1)
        }


        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var iv = findViewById<ImageView>(R.id.iV)
        if(resultCode == RESULT_OK && requestCode == 1 && data != null){

            var image = data?.extras?.get("data") as Bitmap
            iv.setImageBitmap(image)


        }
    }
}