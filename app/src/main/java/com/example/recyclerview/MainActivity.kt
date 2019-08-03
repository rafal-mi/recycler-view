package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewManager: RecyclerView.LayoutManager

    var myDataset = arrayListOf("Gothic", "Melodeath")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)

        (recyclerView as RecyclerView).apply {
            layoutManager = viewManager
            adapter = MyAdapter(myDataset)

        }
    }
}
