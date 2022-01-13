package com.oazisn.luaspersegi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnCount: Button
    private lateinit var etSquareSide: TextInputEditText
    private lateinit var tvSquareArea: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount = findViewById(R.id.btn_count)
        etSquareSide = findViewById(R.id.et_square_side)
        tvSquareArea = findViewById(R.id.tv_square_area)

        btnCount.setOnClickListener {
            val side = etSquareSide.text.toString().toDouble()
            val area = side * side
            val formattedArea = String.format("%.2f", area)

            tvSquareArea.text = getString(R.string.square_area_value, formattedArea)
        }
    }
}