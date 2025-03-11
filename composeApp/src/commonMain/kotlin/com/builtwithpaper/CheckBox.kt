package com.builtwithpaper

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.composables.core.Icon
import com.composables.icons.lucide.Check
import com.composables.icons.lucide.Lucide

@Composable
fun Checkbox(
    checked: Boolean,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = LocalContentColor.current,
    enabled: Boolean = true,
    onCheckedChange: ((Boolean) -> Unit)? = null,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    borderColor: Color = LocalOutlineColor.current,
    borderWidth: Dp = 1.dp,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    checkIcon: @Composable () -> Unit,
) {
    val checkboxAlpha = if (checked) 1f else 0f

    Box(
        modifier
            .border(borderWidth, borderColor, shape)
            .clip(shape)
            .background(backgroundColor)
                then if (onCheckedChange != null) {
            Modifier.clickable(
                enabled = enabled,
                indication = LocalIndication.current,
                interactionSource = interactionSource,
                role = Role.Checkbox,
            ) {
                onCheckedChange(checked.not())
            }
        } else {
            Modifier
        }
    ) {
        Box(modifier = Modifier.alpha(checkboxAlpha)) {
            CompositionLocalProvider(LocalContentColor provides contentColor) {
                checkIcon()
            }
        }
    }
}


@Composable
fun Check() {
    Icon(Lucide.Check, contentDescription = null, tint = LocalContentColor.current)
}
