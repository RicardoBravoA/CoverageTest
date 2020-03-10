package com.rba.coverage.util

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class UtilTest {

    private lateinit var util: Util

    @Before
    fun setup() {
        util = Mockito.mock(Util::class.java)
    }

    @Test
    fun addTestSuccess() {
        Assert.assertEquals(Util.add(2, 2), 4)
    }

    @Test
    fun addTestError() {
        Assert.assertNotEquals(Util.add(2, 2), 5)
    }

}