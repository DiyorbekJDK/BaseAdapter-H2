package com.example.homework_011122

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListView
import androidx.cardview.widget.CardView
import com.example.homework_011122.adapter.ProductAdapter
import com.example.homework_011122.model.ProductInfo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val view: LinearLayout = findViewById(R.id.goToBedRoom)
        view.setOnClickListener {
            val intent = Intent(this, SecondActivty::class.java)
            startActivity(intent)
            finish()
        }
        val btn: ImageView = findViewById(R.id.toSecondTask)
        btn.setOnClickListener {
            val intent2 = Intent(this, ThirdActivity::class.java)
            startActivity(intent2)
            finish()
        }

    }
}