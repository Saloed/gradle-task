package ru.spbstu.task

import com.google.common.collect.ImmutableList

fun <T> Map<UInt, T>.toList(default: T): List<T> = ImmutableList.Builder<T>()
    .apply {
        val lastIndex = keys.maxOfOrNull { it } ?: return@apply
        (0U..lastIndex).forEach {
            add(this@toList[it] ?: default)
        }
    }
    .build()
    .let { GuavaListWrapper(it) }
