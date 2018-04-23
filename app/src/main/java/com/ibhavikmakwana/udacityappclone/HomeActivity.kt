package com.ibhavikmakwana.udacityappclone

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.view.Menu
import com.ibhavikmakwana.udacityappclone.adapter.FreeAdapter
import com.ibhavikmakwana.udacityappclone.adapter.InDemandAdapter
import com.ibhavikmakwana.udacityappclone.adapter.NanodegreeAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import kotlinx.android.synthetic.main.content_home.*


class HomeActivity : AppCompatActivity()/*, NavigationView.OnNavigationItemSelectedListener */ {

    companion object {
        fun launchActivity(context: Context) {
            val intent = Intent(context, HomeActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        toolbar.title = ""
        supportActionBar?.setDisplayShowTitleEnabled(false)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        setUpUI()
    }

    private fun setUpUI() {
        //free courses
        val freeLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val inDemandLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val nanoDegreeLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_free_courses)

        rv_free_courses.layoutManager = freeLayoutManager
        rv_free_courses.adapter = FreeAdapter(this)
        rv_free_courses.isNestedScrollingEnabled = false

        rv_in_demand.layoutManager = inDemandLayoutManager
        rv_in_demand.adapter = InDemandAdapter(this)
        rv_in_demand.isNestedScrollingEnabled = false

        rv_popular_nanodegree.layoutManager = nanoDegreeLayoutManager
        rv_popular_nanodegree.adapter = NanodegreeAdapter(this)
        rv_popular_nanodegree.isNestedScrollingEnabled = false
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.home, menu)
        return true
    }
}
