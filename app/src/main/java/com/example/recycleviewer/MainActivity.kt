package com.example.recycleviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        viewAdapter = MyAdapter(viewModel.data)
        recycleview.adapter = viewAdapter
        recycleview.layoutManager = viewManager
        recycleview.setHasFixedSize(true)
        addItem()

        button_add.setOnClickListener{addItem()}
    }

    private fun addItem(){
        viewModel.data.add(MyData(223,"park"))
        viewAdapter.notifyDataSetChanged()
    }
}
