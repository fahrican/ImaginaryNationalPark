package com.imaginarynationalpark.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imaginarynationalpark.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, AllToursFragment())
            commit()
        }
    }
}