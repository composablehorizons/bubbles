@file:OptIn(ExperimentalComposeUiApi::class)

package com.builtwithpaper

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

@Composable
actual fun currentContainerSize(): DpSize {
    return with(LocalDensity.current) {
        val intSize = LocalWindowInfo.current.containerSize
        DpSize(intSize.width.dp, intSize.height.dp)
    }
}