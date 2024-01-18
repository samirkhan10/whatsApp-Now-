package com.example.whatsappwithotp

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        var etNumber: EditText = findViewById(R.id.etNumber)
        var button: Button = findViewById(R.id.button)



        button.setOnClickListener {
            val number = etNumber.text.toString()
            whatsappOpener(number)

        }


    }
    fun whatsappOpener(number : String){
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse("https://api.whatsapp.com/send?phone=$number")
        startActivity(i)



    }

}