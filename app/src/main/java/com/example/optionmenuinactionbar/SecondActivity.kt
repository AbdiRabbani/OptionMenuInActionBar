package com.example.optionmenuinactionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.optionmenuinactionbar.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {

    private var _mToggle : ActionBarDrawerToggle? = null
    private val mToggle get() = _mToggle as ActionBarDrawerToggle

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}