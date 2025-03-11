package com.builtwithpaper

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun Toggle(
    toggled: Boolean,
    modifier: Modifier = Modifier,
    onToggled: ((Boolean) -> Unit)? = null,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    toggledColor: Color = LocalPrimaryColor.current,
    backgroundColor: Color = LocalContentColor.current.copy(0.44f),
    contentPadding: PaddingValues = PaddingValues(0.dp),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    thumb: @Composable () -> Unit,
) {
    var trackWidth by remember { mutableStateOf(0.dp) }

    val layoutDirection = LocalLayoutDirection.current

    val paddingEnd by derivedStateOf {
        contentPadding.calculateEndPadding(layoutDirection) + contentPadding.calculateStartPadding(layoutDirection)
    }

    val maxOffset by derivedStateOf { (trackWidth / 2) - paddingEnd }
    val offset by animateDpAsState(if (toggled) maxOffset else 0.dp)

    val backgroundColor by animateColorAsState(if (toggled) toggledColor else backgroundColor)

    val density = LocalDensity.current

    Box(
        modifier = modifier
            .widthIn(min = 48.dp)
            .clip(shape)
            .background(backgroundColor, shape)
            .onPlaced { trackWidth = with(density) { it.size.width.toDp() } }
                then (if (onToggled != null)
            Modifier.toggleable(
                value = toggled,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = LocalIndication.current,
                role = Role.Switch
            ) { onToggled(toggled.not()) }
        else Modifier)
            .padding(contentPadding)
    ) {
        Box(Modifier.offset(x = offset)) {
            thumb()
        }
    }
}


@Composable
fun Thumb(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    color: Color = LocalSurfaceColor.current
) {
    Box(
        modifier
            .shadow(2.dp, shape)
            .clip(shape)
            .background(color)
            .size(24.dp)
    )
}