package com.example.clementinomora_adrian_practicapmdm_persistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_to_all_tasks -> {
                findNavController(R.id.fragment_container).navigate(R.id.action_to_all_tasks)
                true
            }
            R.id.action_to_all_modules -> {
                findNavController(R.id.fragment_container).navigate(R.id.action_to_all_modules)
                true
            }
            R.id.action_to_manage_tasks -> {
                findNavController(R.id.fragment_container).navigate(R.id.action_to_manage_tasks)
                true
            }
            R.id.action_to_manage_modules -> {
                findNavController(R.id.fragment_container).navigate(R.id.action_to_manage_modules)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}