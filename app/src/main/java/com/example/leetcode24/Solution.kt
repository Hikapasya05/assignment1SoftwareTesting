package com.example.leetcode24

class Solution:  MinRotatedSortedArray{


    override fun minRotated(nums: IntArray): Int {


        var left = 0
        var right = nums.size - 1

        while (left < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return nums[left]
    }
}