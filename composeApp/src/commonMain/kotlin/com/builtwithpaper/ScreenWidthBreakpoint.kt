@file:OptIn(ExperimentalComposeUiApi::class)

package com.builtwithpaper

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class ScreenWidthBreakpoint(val minWidth: Dp) {
    object Default : ScreenWidthBreakpoint(0.dp)
    object Small : ScreenWidthBreakpoint(640.dp)
    object Medium : ScreenWidthBreakpoint(768.dp)
    object Large : ScreenWidthBreakpoint(1024.dp)
    object ExtraLarge : ScreenWidthBreakpoint(1280.dp)
    object ExtraExtraLarge : ScreenWidthBreakpoint(1536.dp)
}

/**
 * Calculates the current [ScreenWidthBreakpoint] according to the  current application's container width.
 */
@Composable
fun currentScreenWidthBreakpoint(): ScreenWidthBreakpoint {
    val screenWidth = currentContainerSize().width

    val breakpoint = when {
        screenWidth > 1536.dp -> ScreenWidthBreakpoint.ExtraExtraLarge
        screenWidth > 1280.dp -> ScreenWidthBreakpoint.ExtraLarge
        screenWidth > 1024.dp -> ScreenWidthBreakpoint.Large
        screenWidth > 768.dp -> ScreenWidthBreakpoint.Medium
        screenWidth > 640.dp -> ScreenWidthBreakpoint.Small
        else -> ScreenWidthBreakpoint.Default
    }
    return breakpoint
}

infix fun ScreenWidthBreakpoint.isAtLeast(other: ScreenWidthBreakpoint): Boolean {
    return minWidth >= other.minWidth
}

infix fun ScreenWidthBreakpoint.isAtMost(other: ScreenWidthBreakpoint): Boolean {
    return minWidth <= other.minWidth
}
