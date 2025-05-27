package com.focusflow.app.ui.components.animations

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType

// Enhanced animation specifications
object AnimationSpecs {
    val fastEasing = tween<Float>(
        durationMillis = 150,
        easing = FastOutSlowInEasing
    )

    val mediumEasing = tween<Float>(
        durationMillis = 300,
        easing = FastOutSlowInEasing
    )

    val slowEasing = tween<Float>(
        durationMillis = 500,
        easing = FastOutSlowInEasing
    )

    val bounceEasing = spring<Float>(
        dampingRatio = Spring.DampingRatioMediumBouncy,
        stiffness = Spring.StiffnessLow
    )

    val enterTransition = slideInVertically(
        initialOffsetY = { it },
        animationSpec = tween(300)
    ) + fadeIn(animationSpec = tween(300))

    val exitTransition = slideOutVertically(
        targetOffsetY = { it },
        animationSpec = tween(300)
    ) + fadeOut(animationSpec = tween(300))
}

// Bouncy click animation with haptic feedback
@Composable
fun Modifier.bouncyClick(
    enabled: Boolean = true,
    hapticEnabled: Boolean = true,
    onClick: () -> Unit
): Modifier {
    val haptic = LocalHapticFeedback.current
    var isPressed by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.95f else 1f,
        animationSpec = AnimationSpecs.bounceEasing,
        label = "scale"
    )

    return this
        .scale(scale)
        .pointerInput(enabled) {
            if (enabled) {
                detectTapGestures(
                    onPress = {
                        isPressed = true
                        if (hapticEnabled) {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                        }
                        tryAwaitRelease()
                        isPressed = false
                    },
                    onTap = { onClick() }
                )
            }
        }
}

// Shimmer loading animation
@Composable
fun Modifier.shimmerEffect(): Modifier {
    val transition = rememberInfiniteTransition(label = "shimmer")
    val alpha by transition.animateFloat(
        initialValue = 0.2f,
        targetValue = 0.9f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000),
            repeatMode = RepeatMode.Reverse
        ),
        label = "alpha"
    )

    return this.graphicsLayer { this.alpha = alpha }
}

// Slide in from direction animation
@Composable
fun SlideInFromDirection(
    direction: SlideDirection,
    visible: Boolean,
    content: @Composable () -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = when (direction) {
            SlideDirection.Left -> slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
            SlideDirection.Right -> slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
            SlideDirection.Up -> slideInVertically(
                initialOffsetY = { -it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
            SlideDirection.Down -> slideInVertically(
                initialOffsetY = { it },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
        },
        exit = when (direction) {
            SlideDirection.Left -> slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
            SlideDirection.Right -> slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
            SlideDirection.Up -> slideOutVertically(
                targetOffsetY = { -it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
            SlideDirection.Down -> slideOutVertically(
                targetOffsetY = { it },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
        }
    ) {
        content()
    }
}

enum class SlideDirection {
    Left, Right, Up, Down
}

// Pulsing animation for notifications
@Composable
fun Modifier.pulseAnimation(enabled: Boolean = true): Modifier {
    val infiniteTransition = rememberInfiniteTransition(label = "pulse")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = if (enabled) 1.1f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    return this.scale(scale)
}

// Staggered list animation
@Composable
fun <T> StaggeredAnimatedList(
    items: List<T>,
    staggerDelay: Int = 50,
    content: @Composable (item: T, index: Int) -> Unit
) {
    items.forEachIndexed { index, item ->
        var visible by remember { mutableStateOf(false) }

        LaunchedEffect(items) {
            kotlinx.coroutines.delay(index * staggerDelay.toLong())
            visible = true
        }

        AnimatedVisibility(
            visible = visible,
            enter = slideInVertically(
                initialOffsetY = { it / 2 },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            ) + fadeIn(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            )
        ) {
            content(item, index)
        }
    }
}

// Floating action button animation
@Composable
fun Modifier.fabAnimation(extended: Boolean): Modifier {
    val scale by animateFloatAsState(
        targetValue = if (extended) 1f else 0.8f,
        animationSpec = AnimationSpecs.bounceEasing,
        label = "fab_scale"
    )

    return this.scale(scale)
}

// Cross-fade transition
@Composable
fun CrossFadeTransition(
    targetState: Boolean,
    content: @Composable (Boolean) -> Unit
) {
    Crossfade(
        targetState = targetState,
        animationSpec = tween(300),
        label = "crossfade"
    ) { state ->
        content(state)
    }
}
