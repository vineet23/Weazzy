package com.paper.squeeze.weazzy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.paper.squeeze.weazzy.R
import com.paper.squeeze.weazzy.fragment.ChatFragment
import com.paper.squeeze.weazzy.fragment.ExploreFragment
import com.paper.squeeze.weazzy.fragment.StatusFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //initialize fragments
        val chatFragment: ChatFragment = ChatFragment.newInstance()
        val statusFragment: StatusFragment = StatusFragment.newInstance()
        val exploreFragment: ExploreFragment = ExploreFragment.newInstance()

        //to load the chat fragment by default
        loadFragment(chatFragment)

        //bottom navigation selection
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.chatNavigation -> {
                    loadFragment(chatFragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.statusNavigation -> {
                    loadFragment(statusFragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.exploreNavigation -> {
                    loadFragment(exploreFragment)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()
        }
    }
}
