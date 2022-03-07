package ru.spbstu.task

import com.google.common.collect.ImmutableList

class GuavaListWrapper<T> constructor(private val list: ImmutableList<T>) : List<T> by list