package com.builtwithpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified

@Composable
fun TextField(
    value: String,
    editable: Boolean = true,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    placeholderText: String = "",
    contentColor: Color = LocalContentColor.current,
    backgroundColor: Color = Color.Unspecified,
    borderWidth: Dp = 0.dp,
    borderColor: Color = LocalOutlineColor.current,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    textStyle: TextStyle = TextStyle.Default,
    textAlign: TextAlign = TextAlign.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    singleLine: Boolean = false,
    minLines: Int = 1,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    overflow: TextOverflow = TextOverflow.Ellipsis
) {
    val overrideColorOrUnspecified = if (contentColor.isSpecified) {
        contentColor
    } else if (textStyle.color.isSpecified) {
        textStyle.color
    } else {
        LocalContentColor.current
    }

    val overrideTextAlign = if (textAlign != TextAlign.Unspecified) {
        textAlign
    } else textStyle.textAlign

    val overrideFontSize = if (fontSize != TextUnit.Unspecified) {
        fontSize
    } else textStyle.fontSize

    val overrideFontWeight = fontWeight ?: textStyle.fontWeight
    val overrideFontFamily = fontFamily ?: textStyle.fontFamily

    val overriddenStyle = textStyle.merge(
        fontWeight = overrideFontWeight,
        fontSize = overrideFontSize,
        fontFamily = overrideFontFamily,
        textAlign = overrideTextAlign,
    )
    TextInput(
        modifier = modifier.widthIn(min = 2.dp).width(IntrinsicSize.Max) then buildModifier {
            if (borderWidth.isSpecified && borderWidth > 0.dp && borderColor.isSpecified) {
                add(Modifier.border(borderWidth, borderColor, shape))
            }
            add(
                Modifier
                    .background(backgroundColor, shape)
            )
        },
        interactionSource = interactionSource,
        value = value,
        onValueChange = onValueChange,
        editable = editable,
        keyboardOptions = keyboardOptions,
        minLines = minLines,
        maxLines = maxLines,
        singleLine = singleLine,
        style = overriddenStyle,
        overflow = overflow,
        contentPadding = contentPadding,
        placeholder = placeholderText,
    )
}
