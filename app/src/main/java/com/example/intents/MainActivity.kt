package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var send : Button = findViewById(R.id.Send)

        send.setOnClickListener{
            var email: EditText = findViewById(R.id.Email_id)
            var subject: EditText = findViewById(R.id.Subject)
            var body: EditText = findViewById(R.id.Body)

            var EMAIL = email.text.toString().trim()
            var SUBJECT = subject.text.toString().trim()
            var BODY = body.text.toString().trim()

            var inTent = Intent(Intent.ACTION_SEND)
            inTent.data = Uri.parse("mailto:")
            inTent.type ="text/plain"

            inTent.putExtra(Intent.EXTRA_EMAIL,arrayOf(EMAIL))
            inTent.putExtra(Intent.EXTRA_SUBJECT,SUBJECT)
            inTent.putExtra(Intent.EXTRA_TEXT,BODY)


           startActivity(inTent)

        }
    }
}