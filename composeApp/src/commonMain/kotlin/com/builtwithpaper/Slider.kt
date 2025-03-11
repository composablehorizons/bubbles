package com.builtwithpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Slider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    trackColor: Color = LocalPrimaryColor.current,
    trackShape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    thumb: @Composable () -> Unit
) {
    var thumbWidth by remember { mutableStateOf(0.dp) }
    var trackWidth by remember { mutableStateOf(0) }

    val density = LocalDensity.current

    val thumbPosition = trackWidth * value

    Box(modifier = modifier, contentAlignment = Alignment.CenterStart) {
        Box(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = thumbWidth / 2)
                .height(4.dp)
                .background(trackColor.copy(0.44f), trackShape)
                .onPlaced {
                    trackWidth = with(density) { it.size.width }
                }
        )
        Box(
            Modifier
                .padding(horizontal = thumbWidth / 2)
                .width(with(density) { thumbPosition.toDp() })
                .height(4.dp)
                .background(trackColor, trackShape)
        )

        Box(
            Modifier
                .onPlaced { thumbWidth = with(density) { it.size.width.toDp() } }
                .offset(x = with(density) { thumbPosition.toDp() })
                .draggable(
                    enabled = enabled,
                    orientation = Orientation.Horizontal,
                    state = rememberDraggableState { deltaPx ->
                        val valueDelta = deltaPx / trackWidth
                        val newValue = (value + valueDelta).coerceIn(0f, 1f)
                        onValueChange(newValue)
                    }
                )
        ) {
            thumb()
        }
    }
}


@Composable
fun SliderThumb(
    color: Color = LocalSurfaceColor.current,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    elevation: Dp = 4.dp,
) {
    Box(
        Modifier
            .size(28.dp)
            .shadow(elevation, shape)
            .background(color, shape)
    )
}