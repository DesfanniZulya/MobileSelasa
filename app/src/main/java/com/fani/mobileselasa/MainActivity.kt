package com.fani.mobileselasa


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnPassing: Button
    private lateinit var btnListview: Button
    private lateinit var btnRvBuku: Button
    private lateinit var btnRecycleView: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnRvBuku = findViewById<Button>(R.id.btnReciclyView)
        val btnRecycleView= findViewById<Button>(R.id.btnReciclyBuah)
        val btnRecycleViewcard= findViewById<Button>(R.id.btnReciclyView)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        btnRvBuku.setOnClickListener() {
//            startActivity(Intent(this, ReciclyViewActivity::class.java))
//
//        }

        btnRecycleView.setOnClickListener() {
            startActivity(Intent(this, CustomImageRecycleView::class.java))

        }

        btnRecycleViewcard.setOnClickListener() {
            startActivity(Intent(this, RecycleViewCardMovie::class.java))

        }

    }
}