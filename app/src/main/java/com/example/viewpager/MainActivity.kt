package com.example.viewpager

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager : ViewPager
    private lateinit var adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    private fun setupView() {
        // adapter
        adapter = Adapter(supportFragmentManager)

        // LayoutInflater
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        // viewPager
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter

        // tabLayout
        tabLayout = findViewById(R.id.bar)

        // link tabLayout with viewPager
        tabLayout.setupWithViewPager(viewPager)
    }
}