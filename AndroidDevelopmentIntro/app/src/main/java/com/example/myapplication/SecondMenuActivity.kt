package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondMenuActivity : StateLoggerActivity() {
    override val TAG: String = "SecondMenuActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val confChangeCount = getIntent().getStringExtra("CHANGE_COUNT")?.toInt() ?: 0
        val textElement = findViewById<TextView>(R.id.square_text)
        textElement.setText((confChangeCount * confChangeCount).toString())
    }
}