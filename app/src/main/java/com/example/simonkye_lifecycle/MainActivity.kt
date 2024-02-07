package com.example.simonkye_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "onCreate(Bundle?) called")
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        button.setOnClickListener{ view: View ->
            textView.setText("Hello")
            editText.setText("Hello")
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart() called")
    }
    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause() called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onStop() called")
    }
}