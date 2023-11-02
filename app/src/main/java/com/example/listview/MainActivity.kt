package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView:ListView=findViewById(R.id.listView)
        val listItem= arrayOf("Read a book","create a project","learn kotlin","go for shopping","watch movies")
        val listAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,listItem)
        listView.adapter=listAdapter

        listView.setOnItemClickListener  { parent, view, position, id ->
            val selectedItem=parent.getItemAtPosition(position) as String
            Toast.makeText(this,"you have clicked on : $selectedItem",Toast.LENGTH_SHORT).show()
        }
    }
}




