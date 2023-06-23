package com.example.leetcode24

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leetcode24.Solution
import com.example.leetcode24.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val solution = Solution()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.calculateButton.setOnClickListener {
            val inputArray = binding.inputEditText.text.toString()
                .split(",")
                .map { it.trim().toInt() }
                .toIntArray()

            val minimum = solution.findMin(inputArray)

            binding.resultTextView.text = "Result: $minimum"
        }
    }
}