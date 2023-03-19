package com.example.mypersonalinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner: Spinner = findViewById(R.id.spinner2)
        var textView: TextView = findViewById(R.id.textView2)
        var button: Button = findViewById(R.id.button2)


        val options = arrayOf("GitHub", "LinkedIn")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        spinner.adapter = adapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {

                if(position == 0){
                    textView.text = "My Github id is @AhmadNasser"
                }
                else{
                    textView.text = "My LinkedIn ID is Ahmad2001 "
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }


        button.setOnClickListener {
            if(spinner.selectedItemPosition == 0){
                spinner.setSelection(1)
            }
            else{
                spinner.setSelection(0)
            }
        }
    }
}
