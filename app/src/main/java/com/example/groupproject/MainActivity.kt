package com.example.groupproject

import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var bottomNav:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener{
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.exercise -> {
                    loadFragment(ExerciseFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.health -> {
                    loadFragment(HealthFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.profile -> {
                    loadFragment(ProfileFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}

