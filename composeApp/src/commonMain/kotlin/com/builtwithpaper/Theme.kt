package com.builtwithpaper

import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalBackgroundColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOnBackgroundColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalPrimaryColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOnPrimaryColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalSecondaryColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOnSecondaryColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalSurfaceColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOnSurfaceColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalDestructiveColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOnDestructiveColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalOutlineColor = compositionLocalOf<Color> { Color.Unspecified }
val LocalCornerRadius = compositionLocalOf<Dp> { 0.dp }

val LocalBodyLargeTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalBodyMediumTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalBodySmallTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalTitleLargeTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalTitleMediumTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalTitleSmallTextStyle = staticCompositionLocalOf { TextStyle.Default }

val LocalTextStyle = staticCompositionLocalOf { TextStyle.Default }
val LocalContentColor = compositionLocalOf<Color> { Color.Unspecified }

@Composable
fun Theme(
    onBackgroundColor: Color,
    backgroundColor: Color,
    primaryColor: Color,
    onPrimaryColor: Color,
    surfaceColor: Color,
    onSurfaceColor: Color,
    destructiveColor: Color,
    onDestructiveColor: Color,
    secondaryColor: Color,
    onSecondaryColor: Color,
    outlineColor: Color,
    cornerRadius: Dp,
    bodySmall: TextStyle,
    bodyMedium: TextStyle,
    bodyLarge: TextStyle,
    titleSmall: TextStyle,
    titleMedium: TextStyle,
    titleLarge: TextStyle,
    indication: Indication = LocalIndication.current,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalTextStyle provides bodyLarge,
        LocalIndication provides indication,

        LocalOnBackgroundColor provides onBackgroundColor,
        LocalBackgroundColor provides backgroundColor,
        LocalPrimaryColor provides primaryColor,
        LocalOnPrimaryColor provides onPrimaryColor,
        LocalSurfaceColor provides surfaceColor,
        LocalOnSurfaceColor provides onSurfaceColor,
        LocalDestructiveColor provides destructiveColor,
        LocalOnDestructiveColor provides onDestructiveColor,
        LocalOutlineColor provides outlineColor,
        LocalSecondaryColor provides secondaryColor,
        LocalOnSecondaryColor provides onSecondaryColor,
        LocalCornerRadius provides cornerRadius,

        LocalBodySmallTextStyle provides bodySmall,
        LocalBodyMediumTextStyle provides bodyMedium,
        LocalBodyLargeTextStyle provides bodyLarge,

        LocalTitleLargeTextStyle provides titleLarge,
        LocalTitleMediumTextStyle provides titleMedium,
        LocalTitleSmallTextStyle provides titleSmall,

        LocalTextStyle provides bodyMedium,
    ) {
        content()
    }
}