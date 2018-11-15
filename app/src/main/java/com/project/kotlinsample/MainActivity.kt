package com.project.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.project.kotlinsample.adapters.KotlinRecyclerAdapter
import com.project.kotlinsample.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView;
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("test", "test", "test"))
        users.add(User("test", "test", "test"))
        users.add(User("test", "test", "test"))
        users.add(User("test", "test", "test"))
        users.add(User("test", "test", "test"))
        val adapter = KotlinRecyclerAdapter(users)
        recyclerView.adapter = adapter
    }
}
