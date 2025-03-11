package com.builtwithpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar(
    modifier: Modifier = Modifier,
    navigation: (@Composable () -> Unit)? = null,
    title: @Composable () -> Unit = {},
    actions: @Composable () -> Unit = {},
    elevation: Dp = 0.dp,
    contentColor: Color = LocalOnSurfaceColor.current,
    backgroundColor: Color = LocalSurfaceColor.current,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    Row(
        modifier = modifier
            .shadow(elevation)
            .background(backgroundColor)
            .padding(contentPadding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            if (navigation == null) {
                Spacer(Modifier.width(12.dp).fillMaxHeight())
            } else {
                Box(Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
                    navigation()
                }
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxHeight(),
                contentAlignment = Alignment.CenterStart
            ) {
                title()
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxHeight()
            ) {
                actions()
            }
        }
    }
}
