package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val txtEmail : TextView = findViewById(R.id.txtEmail)
        val txtAddress : TextView = findViewById(R.id.txtAddress)
        val txtPhoneNumber : TextView = findViewById(R.id.txtPhoneNumber)
        val txtAge : TextView = findViewById(R.id.txtAge)

        //retrieving
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val address = intent.getStringExtra("address")
        val phone = intent.getStringExtra("phone")
        val age = intent.getIntExtra("age", 0)

        //displaying
        txtAge.text = age.toString()
        txtAddress.text = address
        txtEmail.text = email
        txtPhoneNumber.text = phone

        //Displaying on the actionbar

        val actionBar = supportActionBar
        actionBar!!.title = name

    }
}