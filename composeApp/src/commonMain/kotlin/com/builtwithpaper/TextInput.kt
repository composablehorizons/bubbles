package com.builtwithpaper

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.isSpecified
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    editable: Boolean = true,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    textAlign: TextAlign = style.textAlign,
    fontSize: TextUnit = style.fontSize,
    lineHeight: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = style.fontWeight,
    color: Color = style.color,
    fontFamily: FontFamily? = style.fontFamily,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    singleLine: Boolean = false,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    minLines: Int = 1,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    cursorBrush: Brush = SolidColor(Color.Black),
    placeholder: String = "",
) {
    val placeholderColor = color.copy(alpha = 0.4f)

    val currentColor = listOf(
        color,
        style.color,
        LocalContentColor.current
    ).firstOrNull { it != Color.Unspecified } ?: Color.Unspecified

    val currentTextAlign = listOf(
        textAlign,
        style.textAlign,
    ).firstOrNull { it != TextAlign.Unspecified } ?: TextAlign.Unspecified


    val currentLineHeight = listOf(
        lineHeight,
        style.lineHeight,
    ).firstOrNull { it != TextUnit.Unspecified } ?: TextUnit.Unspecified

    val currentStyle = style.copy(
        textAlign = currentTextAlign,
        fontSize = fontSize,
        color = currentColor,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        lineHeight = currentLineHeight
    )

    var wasEditable by remember { mutableStateOf(editable) }

    var textRange by remember { mutableStateOf(TextRange(value.length, value.length)) }

    val isFocused by interactionSource.collectIsFocusedAsState()

    LaunchedEffect(editable) {
        if (wasEditable.not() && editable) {
            // just changed to editable. select all text
            textRange = TextRange(0, value.length)
        }
        wasEditable = editable
    }

    if (editable) {
        val textFieldValue by derivedStateOf { TextFieldValue(value, textRange) }
        val focusRequester = remember { FocusRequester() }

        LaunchedEffect(Unit) {
            if (isFocused) {
                focusRequester.requestFocus()
            }
        }

        BasicTextField(
            value = textFieldValue,
            onValueChange = {
                onValueChange(it.text)
                textRange = it.selection
            },
            textStyle = currentStyle,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            modifier = modifier
                .focusRequester(focusRequester)
                .widthIn(min = 2.dp) // width for the cursor blink
                .width(IntrinsicSize.Min) // override default width
            ,
            interactionSource = interactionSource,
            cursorBrush = cursorBrush,
            keyboardOptions = keyboardOptions
        ) {
            Box(Modifier.padding(contentPadding)) {
                it()
                if (value.isBlank()) {
                    Text(placeholder, color = placeholderColor,style = style)
                }
            }
        }
    } else {
        val actualColor = if (value.isBlank() && placeholderColor.isSpecified) placeholderColor else color

        Text(
            text = value.ifBlank { placeholder },
            style = currentStyle,
            color = actualColor,
            modifier = modifier
                .widthIn(min = 2.dp) // width for the cursor blink
                .focusable(interactionSource = interactionSource)
                .padding(contentPadding),
            minLines = minLines,
            maxLines = maxLines,
            overflow = overflow,
        )
    }
}
