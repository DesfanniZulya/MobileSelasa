package com.fani.mobileselasa

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var imgDetailBuah : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        val detailText = intent.getStringExtra("deskripsi")
        val detailImage = intent.getIntExtra("image", 0)

        txtDetailBuah.setText(detailText)
        imgDetailBuah.setImageResource(detailImage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}