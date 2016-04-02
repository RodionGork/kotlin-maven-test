package hello

import org.junit.Assert.assertEquals
import org.junit.Test

class HelloTest {

    @Test
    fun testGetHelloString() {
        assertEquals("Hi, Peoplez!", getHelloString())
    }

}

