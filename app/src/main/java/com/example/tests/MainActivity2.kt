package com.example.tests

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity2 : AppCompatActivity() {
    fun isEmailValid(email: String): Boolean {
        var isValid = false
        val expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
        val inputStr: CharSequence = email
        val pattern: Pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
        val matcher: Matcher = pattern.matcher(inputStr)
        if (matcher.matches()) {
            isValid = true
        }
        return isValid
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnOrder: Button = findViewById(R.id.btnOrder)
        val btnMap: Button = findViewById(R.id.btnMap)
        val evEmail: EditText = findViewById(R.id.editTextTextPersonName3)
        evEmail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

             override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                 if (evEmail.getText().toString().equals(""))
                 {
                 }
                 else
                 {
                     val email: String = evEmail.getText().toString().trim()
                     if (isEmailValid(email))
                     {
                         evEmail.setBackgroundResource(R.drawable.rounded_corner_green)
                     }
                     else{
                         evEmail.setBackgroundResource(R.drawable.rounded_corner)
                     }
                 }
            }

        })
        btnOrder.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnMap.setOnClickListener {
            val geoUriString = "geo:55.0440998,82.9175791?z=17"
            val geoUri: Uri = Uri.parse(geoUriString)
            val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
            startActivity(mapIntent)

        }
    }
}