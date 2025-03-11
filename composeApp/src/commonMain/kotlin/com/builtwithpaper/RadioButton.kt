package com.builtwithpaper

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RadioButton(
    selected: Boolean,
    modifier: Modifier = Modifier,
    backgroundColor: Color = LocalSurfaceColor.current,
    contentColor: Color = LocalOnSurfaceColor.current,
    selectedColor: Color = LocalPrimaryColor.current,
    enabled: Boolean = true,
    onSelectedChange: ((Boolean) -> Unit)? = null,
    shape: Shape = CircleShape,
    borderColor: Color = LocalOutlineColor.current,
    borderWidth: Dp = 1.dp,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    radio: @Composable () -> Unit,
) {
    val checkboxAlpha = if (selected) 1f else 0f

    Box(
        modifier
            .border(borderWidth, borderColor, shape)
            .clip(shape)
            .background(backgroundColor)
                then if (onSelectedChange != null) {
            Modifier.clickable(
                enabled = enabled,
                indication = LocalIndication.current,
                interactionSource = interactionSource,
                role = Role.RadioButton,
            ) {
                onSelectedChange(selected.not())
            }
        } else {
            Modifier
        }.padding(contentPadding)
    ) {
        Box(modifier = Modifier.alpha(checkboxAlpha)) {
            CompositionLocalProvider(
                LocalContentColor provides if (selected) selectedColor else contentColor
            ) {
                radio()
            }
        }
    }
}

@Composable
fun Radio() {
    Box(
        modifier = Modifier
            .size(24.dp)
            .padding(4.dp)
            .clip(CircleShape)
            .background(LocalPrimaryColor.current)
    )
}
