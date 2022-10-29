package com.saugat.dynamictablerow

import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.saugat.dynamictablerow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            val tableRow = TableRow(this)
            val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
            tableRow.layoutParams = layoutParams

            val androidVersionText = TextView(this)
            androidVersionText.setPadding(10, 10, 10, 10)
            androidVersionText.textAlignment = View.TEXT_ALIGNMENT_CENTER
            androidVersionText.text = binding.androidVersionET.editableText.toString()

            val androidNameText = TextView(this)
            androidNameText.setPadding(10, 10, 10, 10)
            androidNameText.textAlignment = View.TEXT_ALIGNMENT_CENTER
            androidNameText.text = binding.androidCodeET.editableText.toString()

            tableRow.addView(androidVersionText)
            tableRow.addView(androidNameText)

            binding.tableLayout.addView(tableRow)
        }

    }
}