package com.timothee_corrado.application_1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textView = findViewById<TextView>(R.id.mainText)

        //textView.text = "Louis est beau"
       // val editText = findViewById<EditText>(R.id.editText)
       // val button = findViewById<Button>(R.id.Button)

      //  button.setOnClickListener {
            //Log.d("iim", "Click")
       //     textView.text = "hello ${editText.text}"
      //  }

        Button.setOnClickListener()
        {
            //mainText.text= "Hello ${editText.text}"
            val intent = Intent(this,MapsActivity::class.java)
            val bundle = Bundle()

            bundle.putString(Main2Activity.ARG_TEXT, editText.text.toString())
            intent.putExtras(bundle)

            startActivity(intent)
        }

    }
}

