package com.builtwithpaper

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


public val Google: ImageVector
    get() {
        if (_Google != null) {
            return _Google!!
        }
        _Google = ImageVector.Builder(
            name = "Google",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15.545f, 6.558f)
                arcToRelative(9.4f, 9.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.139f, 1.626f)
                curveToRelative(0f, 2.434f, -0.87f, 4.492f, -2.384f, 5.885f)
                horizontalLineToRelative(0.002f)
                curveTo(11.978f, 15.292f, 10.158f, 16f, 8f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.352f, 2.082f)
                lineToRelative(-2.284f, 2.284f)
                arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3.166f)
                curveToRelative(-2.087f, 0f, -3.86f, 1.408f, -4.492f, 3.304f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.063f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.635f, 1.893f, 2.405f, 3.301f, 4.492f, 3.301f)
                curveToRelative(1.078f, 0f, 2.004f, -0.276f, 2.722f, -0.764f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.599f, -2.431f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3.08f)
                close()
            }
        }.build()
        return _Google!!
    }

private var _Google: ImageVector? = null


public val Github: ImageVector
    get() {
        if (_Github != null) {
            return _Github!!
        }
        _Github = ImageVector.Builder(
            name = "Github",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 0f)
                curveTo(3.58f, 0f, 0f, 3.58f, 0f, 8f)
                curveToRelative(0f, 3.54f, 2.29f, 6.53f, 5.47f, 7.59f)
                curveToRelative(0.4f, 0.07f, 0.55f, -0.17f, 0.55f, -0.38f)
                curveToRelative(0f, -0.19f, -0.01f, -0.82f, -0.01f, -1.49f)
                curveToRelative(-2.01f, 0.37f, -2.53f, -0.49f, -2.69f, -0.94f)
                curveToRelative(-0.09f, -0.23f, -0.48f, -0.94f, -0.82f, -1.13f)
                curveToRelative(-0.28f, -0.15f, -0.68f, -0.52f, -0.01f, -0.53f)
                curveToRelative(0.63f, -0.01f, 1.08f, 0.58f, 1.23f, 0.82f)
                curveToRelative(0.72f, 1.21f, 1.87f, 0.87f, 2.33f, 0.66f)
                curveToRelative(0.07f, -0.52f, 0.28f, -0.87f, 0.51f, -1.07f)
                curveToRelative(-1.78f, -0.2f, -3.64f, -0.89f, -3.64f, -3.95f)
                curveToRelative(0f, -0.87f, 0.31f, -1.59f, 0.82f, -2.15f)
                curveToRelative(-0.08f, -0.2f, -0.36f, -1.02f, 0.08f, -2.12f)
                curveToRelative(0f, 0f, 0.67f, -0.21f, 2.2f, 0.82f)
                curveToRelative(0.64f, -0.18f, 1.32f, -0.27f, 2f, -0.27f)
                reflectiveCurveToRelative(1.36f, 0.09f, 2f, 0.27f)
                curveToRelative(1.53f, -1.04f, 2.2f, -0.82f, 2.2f, -0.82f)
                curveToRelative(0.44f, 1.1f, 0.16f, 1.92f, 0.08f, 2.12f)
                curveToRelative(0.51f, 0.56f, 0.82f, 1.27f, 0.82f, 2.15f)
                curveToRelative(0f, 3.07f, -1.87f, 3.75f, -3.65f, 3.95f)
                curveToRelative(0.29f, 0.25f, 0.54f, 0.73f, 0.54f, 1.48f)
                curveToRelative(0f, 1.07f, -0.01f, 1.93f, -0.01f, 2.2f)
                curveToRelative(0f, 0.21f, 0.15f, 0.46f, 0.55f, 0.38f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
            }
        }.build()
        return _Github!!
    }

private var _Github: ImageVector? = null


public val Facebook: ImageVector
    get() {
        if (_Facebook != null) {
            return _Facebook!!
        }
        _Facebook = ImageVector.Builder(
            name = "Facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 8.049f)
                curveToRelative(0f, -4.446f, -3.582f, -8.05f, -8f, -8.05f)
                curveTo(3.58f, 0f, -0.002f, 3.603f, -0.002f, 8.05f)
                curveToRelative(0f, 4.017f, 2.926f, 7.347f, 6.75f, 7.951f)
                verticalLineToRelative(-5.625f)
                horizontalLineToRelative(-2.03f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.75f)
                verticalLineTo(6.275f)
                curveToRelative(0f, -2.017f, 1.195f, -3.131f, 3.022f, -3.131f)
                curveToRelative(0.876f, 0f, 1.791f, 0.157f, 1.791f, 0.157f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(-1.009f)
                curveToRelative(-0.993f, 0f, -1.303f, 0.621f, -1.303f, 1.258f)
                verticalLineToRelative(1.51f)
                horizontalLineToRelative(2.218f)
                lineToRelative(-0.354f, 2.326f)
                horizontalLineTo(9.25f)
                verticalLineTo(16f)
                curveToRelative(3.824f, -0.604f, 6.75f, -3.934f, 6.75f, -7.951f)
            }
        }.build()
        return _Facebook!!
    }

private var _Facebook: ImageVector? = null

public val Apple: ImageVector
    get() {
        if (_Apple != null) {
            return _Apple!!
        }
        _Apple = ImageVector.Builder(
            name = "Apple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.182f, 0.008f)
                curveTo(11.148f, -0.03f, 9.923f, 0.023f, 8.857f, 1.18f)
                curveToRelative(-1.066f, 1.156f, -0.902f, 2.482f, -0.878f, 2.516f)
                reflectiveCurveToRelative(1.52f, 0.087f, 2.475f, -1.258f)
                reflectiveCurveToRelative(0.762f, -2.391f, 0.728f, -2.43f)
                moveToRelative(3.314f, 11.733f)
                curveToRelative(-0.048f, -0.096f, -2.325f, -1.234f, -2.113f, -3.422f)
                reflectiveCurveToRelative(1.675f, -2.789f, 1.698f, -2.854f)
                reflectiveCurveToRelative(-0.597f, -0.79f, -1.254f, -1.157f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.563f, -0.434f)
                curveToRelative(-0.108f, -0.003f, -0.483f, -0.095f, -1.254f, 0.116f)
                curveToRelative(-0.508f, 0.139f, -1.653f, 0.589f, -1.968f, 0.607f)
                curveToRelative(-0.316f, 0.018f, -1.256f, -0.522f, -2.267f, -0.665f)
                curveToRelative(-0.647f, -0.125f, -1.333f, 0.131f, -1.824f, 0.328f)
                curveToRelative(-0.49f, 0.196f, -1.422f, 0.754f, -2.074f, 2.237f)
                curveToRelative(-0.652f, 1.482f, -0.311f, 3.83f, -0.067f, 4.56f)
                reflectiveCurveToRelative(0.625f, 1.924f, 1.273f, 2.796f)
                curveToRelative(0.576f, 0.984f, 1.34f, 1.667f, 1.659f, 1.899f)
                reflectiveCurveToRelative(1.219f, 0.386f, 1.843f, 0.067f)
                curveToRelative(0.502f, -0.308f, 1.408f, -0.485f, 1.766f, -0.472f)
                curveToRelative(0.357f, 0.013f, 1.061f, 0.154f, 1.782f, 0.539f)
                curveToRelative(0.571f, 0.197f, 1.111f, 0.115f, 1.652f, -0.105f)
                curveToRelative(0.541f, -0.221f, 1.324f, -1.059f, 2.238f, -2.758f)
                quadToRelative(0.52f, -1.185f, 0.473f, -1.282f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.182f, 0.008f)
                curveTo(11.148f, -0.03f, 9.923f, 0.023f, 8.857f, 1.18f)
                curveToRelative(-1.066f, 1.156f, -0.902f, 2.482f, -0.878f, 2.516f)
                reflectiveCurveToRelative(1.52f, 0.087f, 2.475f, -1.258f)
                reflectiveCurveToRelative(0.762f, -2.391f, 0.728f, -2.43f)
                moveToRelative(3.314f, 11.733f)
                curveToRelative(-0.048f, -0.096f, -2.325f, -1.234f, -2.113f, -3.422f)
                reflectiveCurveToRelative(1.675f, -2.789f, 1.698f, -2.854f)
                reflectiveCurveToRelative(-0.597f, -0.79f, -1.254f, -1.157f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.563f, -0.434f)
                curveToRelative(-0.108f, -0.003f, -0.483f, -0.095f, -1.254f, 0.116f)
                curveToRelative(-0.508f, 0.139f, -1.653f, 0.589f, -1.968f, 0.607f)
                curveToRelative(-0.316f, 0.018f, -1.256f, -0.522f, -2.267f, -0.665f)
                curveToRelative(-0.647f, -0.125f, -1.333f, 0.131f, -1.824f, 0.328f)
                curveToRelative(-0.49f, 0.196f, -1.422f, 0.754f, -2.074f, 2.237f)
                curveToRelative(-0.652f, 1.482f, -0.311f, 3.83f, -0.067f, 4.56f)
                reflectiveCurveToRelative(0.625f, 1.924f, 1.273f, 2.796f)
                curveToRelative(0.576f, 0.984f, 1.34f, 1.667f, 1.659f, 1.899f)
                reflectiveCurveToRelative(1.219f, 0.386f, 1.843f, 0.067f)
                curveToRelative(0.502f, -0.308f, 1.408f, -0.485f, 1.766f, -0.472f)
                curveToRelative(0.357f, 0.013f, 1.061f, 0.154f, 1.782f, 0.539f)
                curveToRelative(0.571f, 0.197f, 1.111f, 0.115f, 1.652f, -0.105f)
                curveToRelative(0.541f, -0.221f, 1.324f, -1.059f, 2.238f, -2.758f)
                quadToRelative(0.52f, -1.185f, 0.473f, -1.282f)
            }
        }.build()
        return _Apple!!
    }

private var _Apple: ImageVector? = null
