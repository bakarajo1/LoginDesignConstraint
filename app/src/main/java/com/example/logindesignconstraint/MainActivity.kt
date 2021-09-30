package com.example.logindesignconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

lateinit var textView: TextView
lateinit var editText: EditText
lateinit var editText1: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.editTextTextPersonName)
        editText1=findViewById(R.id.editTextTextPersonName2)
        textView=findViewById(R.id.textView3)
    }

    fun sss(view: View) {

    if(editText.text.toString()=="" || editText1.text.toString()==""){
        textView.setVisibility(View.VISIBLE)
    }


    }
}