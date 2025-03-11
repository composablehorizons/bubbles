package com.builtwithpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    contentColor: Color = LocalOnSurfaceColor.current,
    backgroundColor: Color = LocalSurfaceColor.current,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier.background(backgroundColor).padding(contentPadding).selectableGroup(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}

@Composable
fun TabItem(
    selected: Boolean,
    onSelected: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selectedColor: Color = LocalPrimaryColor.current,
    contentColor: Color = LocalContentColor.current,
    content: @Composable () -> Unit
) {
    GhostButton(
        enabled = enabled,
        modifier = modifier,
        onClick = onSelected,
        contentColor = if (selected) selectedColor else contentColor,
    ) {
        content()
    }
}
