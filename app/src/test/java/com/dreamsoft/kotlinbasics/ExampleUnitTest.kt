package com.dreamsoft.kotlinbasics

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val result = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", result in 1..6)
    }
}