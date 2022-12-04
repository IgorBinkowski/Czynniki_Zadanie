package com.example.czynniki

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun czynniki(liczba: Int): List<Int>
        {
            var g: MutableList<Int> = mutableListOf()
            var i = 2
            var n = liczba

            while (n > 1) {
                if (n % i == 0) {
                    g+=i
                    n /= i
                } else {
                    i++
                }
            }

            return g
        }
        findViewById<Button>(R.id.Oblicz).setOnClickListener{

            val n =findViewById<EditText>(R.id.Liczba).text.toString().toInt()
            val result = czynniki(n)
            findViewById<TextView>(R.id.Wynik).text = "Wynik: "+ result
    }
    }
}