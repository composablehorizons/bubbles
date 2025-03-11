package com.builtwithpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun Card(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    elevation: Dp = 0.dp,
    backgroundColor: Color = LocalSurfaceColor.current,
    contentColor: Color = LocalOnSurfaceColor.current,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    borderWidth: Dp = 0.dp,
    borderColor: Color = LocalOutlineColor.current,
    content: @Composable () -> Unit = {}
) {
    Box(
        modifier
            .shadow(elevation = elevation, shape = shape)
            .zIndex(elevation.value)
            .border(width = borderWidth, color = borderColor, shape = shape)
            .clip(shape)
            .background(backgroundColor, shape)
            .padding(contentPadding)
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}
