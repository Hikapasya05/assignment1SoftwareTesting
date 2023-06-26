package com.example.leetcode24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        testFindMin()
    }
    private fun testFindMin() {
        val solution = Solution()

        //Test Case 1
        val nums1 = intArrayOf(3, 4, 5, 1, 2)
        assert(solution.minRotated(nums1) == 1)

        //Test Case 2
        val nums2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        assert(solution.minRotated(nums2) == 0)

        //Test Case 3
        val nums3 = intArrayOf(11, 13, 15, 17)
        assert(solution.minRotated(nums3) == 11)

        println("All test cases pass")
    }
}