package com.example.leetcode24

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class SolutionTest{
    @get: Rule
    val solutionRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testMinimumValue_sortedRotatedArray(){
        val numInput = "0, 1, 2, 4, 5, 6, 7"
        val expectedOutput = "Result: 0"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }
    @Test
    fun testMinimumValue_sortedRotatedArrayWithDuplicates(){
        val numInput = "2, 2, 2, 0, 1"
        val expectedOutput = "Result: 0"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }
    @Test
    fun testMinimumValue_rotatedArrayWithOneElement(){
        val numInput = "1"
        val expectedOutput = "Result: 1"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testMinimumValue_rotatedArrayWithTwoElements(){
        val numInput = "2, 1"
        val expectedOutput = "Result: 1"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testMinimumValue_rotatedArrayWithThreeElements(){
        val numInput = "3, 2, 1"
        val expectedOutput = "Result: 1"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testMinimumValue_rotatedArrayWithLargeNumbers(){
        val numInput = "50, 60, 70, 80, 90, 20, 30, 40"
        val expectedOutput = "Result: 20"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun testMinimumValue_rotatedArrayValue(){
        val numInput = "4, 5, 6, 7, 0, 1, 2"
        val expectedOutput = "Result: 0"

        val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.waitForIdle()
        val inputBox = device.findObject(By.res("com.example.leetcode24:id/inputEditText"))
        assertNotNull("Input box not found", inputBox)
        inputBox.text = numInput
        val button = device.findObject(By.res("com.example.leetcode24:id/calculateButton"))
        assertNotNull("Button not found", expectedOutput)
        button.click()
        val output = device.findObject(By.res("com.example.leetcode24:id/resultTextView"))
        val actualOutput = output.text



        assertEquals(expectedOutput, actualOutput)
    }





}