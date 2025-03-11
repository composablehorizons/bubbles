package com.builtwithpaper

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
inline fun buildModifier(builder: @Composable MutableList<Modifier>.() -> Unit): Modifier {
    val list = mutableListOf<Modifier>()
    builder(list)
    return list.fold(Modifier as Modifier) { acc, modifier ->
        acc then modifier
    }
}
