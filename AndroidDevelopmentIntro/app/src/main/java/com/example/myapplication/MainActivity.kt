package com.example.myapplication

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : StateLoggerActivity() {
    override val TAG: String = "MainActivity"

    var confChangesCount = 0
    var textElement: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textElement = findViewById<TextView>(R.id.confChangesCount)
        textElement?.setText("0")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        incValue()
    }

    fun incValue() {
        confChangesCount++
        textElement?.setText(confChangesCount.toString())
    }

    fun openSecondMenu(view: View){
        val intent = Intent(
            this,
            SecondMenuActivity::class.java
        ).apply {
            val bundle = Bundle().apply { putString("CHANGE_COUNT", confChangesCount.toString()) }
            putExtras(bundle)
        }

        startActivity(intent)
    }
}