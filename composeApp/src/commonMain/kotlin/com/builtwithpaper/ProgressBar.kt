package com.builtwithpaper

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
fun ProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(LocalCornerRadius.current),
    color: Color = LocalPrimaryColor.current,
    backgroundColor: Color = LocalSecondaryColor.current,
    animationSpec: AnimationSpec<Float> = tween<Float>(easing = LinearEasing),
) {
    val cappedProgress = progress.coerceIn(0f, 1f)
    val animatedProgress by animateFloatAsState(targetValue = cappedProgress, animationSpec = animationSpec)

    Box(modifier.clip(shape).background(backgroundColor).heightIn(min = 2.dp)) {
        Box(Modifier.matchParentSize()) {
            Box(
                Modifier
                    .background(color)
                    .fillMaxHeight()
                    .fillMaxWidth(animatedProgress)
            )
        }
    }
}