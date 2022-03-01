package ru.spbstu.task

import kotlin.test.Test
import kotlin.test.assertEquals

class Tests {
    @Test
    fun `test empty map`() {
        val map = emptyMap<UInt, String>()
        assertEquals(0, map.toList("").size)
    }

    @Test
    fun `test list contains all entries`() {
        val map = mapOf(0U to "123", 1U to "456", 7U to "789")
        val list = map.toList("")
        assertEquals(8, list.size)
        assertEquals(map[0U], list[0])
        assertEquals(map[1U], list[1])
        assertEquals(map[7U], list[7])
    }
}
