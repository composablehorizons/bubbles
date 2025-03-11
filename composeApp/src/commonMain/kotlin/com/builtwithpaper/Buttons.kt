package com.builtwithpaper

import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isUnspecified
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val DefaultButtonPaddingValues = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
val DefaultButtonBorderWidth = 1.dp

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    contentColor: Color = LocalOnPrimaryColor.current,
    backgroundColor: Color = LocalPrimaryColor.current,
    borderColor: Color = LocalPrimaryColor.current,
    borderWidth: Dp = DefaultButtonBorderWidth,
    elevation: Dp = 0.dp,
    contentPadding: PaddingValues = DefaultButtonPaddingValues,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    val backgroundColor = if (enabled) backgroundColor else backgroundColor.copy(alpha = 0.50f)
    val borderColor = if (enabled) borderColor else borderColor.copy(alpha = 0.50f)

    UnstyledButton(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        backgroundColor = backgroundColor,
        modifier = modifier,
        contentPadding = contentPadding,
        borderColor = borderColor,
        elevation = elevation,
        borderWidth = borderWidth,
        interactionSource = interactionSource,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}

@Composable
fun SecondaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentColor: Color = LocalOnSecondaryColor.current,
    backgroundColor: Color = LocalSecondaryColor.current,
    borderColor: Color = LocalSecondaryColor.current,
    borderWidth: Dp = DefaultButtonBorderWidth,
    elevation: Dp = 0.dp,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    contentPadding: PaddingValues = DefaultButtonPaddingValues,
    content: @Composable () -> Unit
) {
    val contentColor = if (enabled) contentColor else contentColor.copy(alpha = 0.50f)
    val backgroundColor = if (enabled) backgroundColor else backgroundColor.copy(alpha = 0.50f)
    val borderColor = if (enabled) borderColor else borderColor.copy(alpha = 0.50f)

    UnstyledButton(
        enabled = enabled,
        onClick = onClick,
        shape = shape,
        backgroundColor = backgroundColor,
        modifier = modifier,
        borderColor = borderColor,
        borderWidth = borderWidth,
        elevation = elevation,
        contentPadding = contentPadding,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}

@Composable
fun OutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    contentColor: Color = LocalContentColor.current,
    backgroundColor: Color = Color.Transparent,
    borderColor: Color = LocalOutlineColor.current,
    borderWidth: Dp = DefaultButtonBorderWidth,
    contentPadding: PaddingValues = DefaultButtonPaddingValues,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    val contentColor = if (enabled) contentColor else contentColor.copy(alpha = 0.50f)
    val backgroundColor = if (enabled) backgroundColor else backgroundColor.copy(alpha = 0.50f)
    val borderColor = if (enabled) borderColor else borderColor.copy(alpha = 0.50f)

    UnstyledButton(
        onClick = onClick,
        shape = shape,
        enabled = enabled,
        backgroundColor = backgroundColor,
        modifier = modifier,
        contentPadding = contentPadding,
        elevation = elevation,
        borderWidth = borderWidth,
        borderColor = borderColor,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}


@Composable
fun GhostButton(
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    contentColor: Color = LocalContentColor.current,
    backgroundColor: Color = Color.Transparent,
    borderColor: Color = Color.Transparent,
    borderWidth: Dp = DefaultButtonBorderWidth,
    contentPadding: PaddingValues = DefaultButtonPaddingValues,
    content: @Composable () -> Unit
) {
    val contentColor = if (enabled) contentColor else contentColor.copy(alpha = 0.50f)
    val borderColor = when {
        borderColor.isUnspecified || borderColor == Color.Transparent -> Color.Transparent
        enabled -> borderColor
        else -> borderColor.copy(alpha = 0.50f)
    }
    UnstyledButton(
        onClick = onClick,
        shape = shape,
        backgroundColor = backgroundColor,
        modifier = modifier,
        enabled = enabled,
        borderColor = borderColor,
        borderWidth = borderWidth,
        contentPadding = contentPadding,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}

@Composable
fun DestructiveButton(
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    contentColor: Color = LocalOnDestructiveColor.current,
    backgroundColor: Color = LocalDestructiveColor.current,
    borderColor: Color = LocalDestructiveColor.current,
    borderWidth: Dp = DefaultButtonBorderWidth,
    contentPadding: PaddingValues = DefaultButtonPaddingValues,
    elevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    val backgroundColor = if (enabled) backgroundColor else backgroundColor.copy(alpha = 0.50f)
    val borderColor = if (enabled) borderColor else borderColor.copy(alpha = 0.50f)

    UnstyledButton(
        onClick = onClick,
        shape = shape,
        backgroundColor = backgroundColor,
        modifier = modifier,
        enabled = enabled,
        borderColor = borderColor,
        elevation = elevation,
        borderWidth = borderWidth,
        contentPadding = contentPadding,
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            content()
        }
    }
}

@Composable
private fun UnstyledButton(
    onClick: () -> Unit,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    backgroundColor: Color = Color.Unspecified,
    elevation: Dp = 0.dp,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    borderColor: Color = Color.Unspecified,
    borderWidth: Dp = 0.dp,
    modifier: Modifier = Modifier,
    indication: Indication? = LocalIndication.current,
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit = {}
) {
    Box(
        modifier = modifier
            .then(if (elevation > 0.dp) Modifier.shadow(elevation, shape) else Modifier)
            .clip(shape)
            .background(backgroundColor)
            .clickable(
                onClick = onClick,
                role = Role.Button,
                enabled = enabled,
                indication = indication,
                interactionSource = interactionSource
            )
            .border(borderWidth, borderColor, shape)
            .padding(contentPadding)
    ) {
        content()
    }
}
