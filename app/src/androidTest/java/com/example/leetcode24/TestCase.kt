package com.example.leetcode24


import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Test



class MinimumTest {


    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testFindMin1() {
        val solution = Solution()

        // Test Case 1
        val nums1 = intArrayOf(3, 4, 5, 1, 2)
        assert(solution.findMin(nums1) == 1)




    }

    @Test
    fun testFindMin2() {
        val solution = Solution()

        // Test Case 2
        val nums2 = intArrayOf(4, 5, 6, 7, 0, 1, 2)
        assert(solution.findMin(nums2) == 0)

    }

    @Test
    fun testFindMin3() {
        val solution = Solution()

        // Test Case 3
        val nums3 = intArrayOf(11, 13, 15, 17)
        assert(solution.findMin(nums3) == 11)

    }

    @Test
    fun testFindMin4() {
        val solution = Solution()

        //Test Case 4
        val nums4 = intArrayOf(19, 20 ,21 ,17, 18)
        assert(solution.findMin(nums4) == 17)
    }
}