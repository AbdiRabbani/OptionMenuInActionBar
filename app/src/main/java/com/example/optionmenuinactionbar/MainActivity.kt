package com.example.optionmenuinactionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.optionmenuinactionbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    private var _appBarConfig : AppBarConfiguration? = null
    private val appBarConfiguration get() = _appBarConfig as AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val drawerLayout = binding.drawerLayout
        val navView = binding.navView
        val navController = findNavController(R.id.content_main)

        _appBarConfig = AppBarConfiguration(
            setOf(
                R.id.firstFragment,
                R.id.seccondFragment,
                R.id.thirdFragment,
            ),drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(
            R.id.content_main
        )
        return super.onSupportNavigateUp() || navController.navigateUp(appBarConfiguration)
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.menu_1 -> Toast.makeText(this, "you has share this content", Toast.LENGTH_SHORT)
//                .show()
//            R.id.menu_2 -> Toast.makeText(this, "menu 2 has been clicked", Toast.LENGTH_SHORT)
//                .show()
//            R.id.menu_3 -> Toast.makeText(this, "you clicked menu 3", Toast.LENGTH_SHORT)
//                .show()
//        }
//
//        return true
//    }
}