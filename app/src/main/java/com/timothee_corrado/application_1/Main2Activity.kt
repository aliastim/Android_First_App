package com.timothee_corrado.application_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = intent.extras.getString(ARG_TEXT)
        mainText2.text = text

    }

    companion object {
        const val ARG_TEXT = "text"
    }
}
