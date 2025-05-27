package com.focusflow.app.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController

// Enhanced theme utilities for dynamic theming
object DynamicThemeUtils {
    @Composable
    fun getDynamicColorScheme(
        darkTheme: Boolean = isSystemInDarkTheme(),
        dynamicColor: Boolean = true
    ): ColorScheme {
        return when {
            dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
                val context = LocalContext.current
                if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            }
            darkTheme -> DarkColorScheme
            else -> LightColorScheme
        }
    }

    @Composable
    fun setupSystemUI(darkTheme: Boolean, colorScheme: ColorScheme) {
        val view = LocalView.current
        val systemUiController = rememberSystemUiController()

        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as android.app.Activity).window
                WindowCompat.setDecorFitsSystemWindows(window, false)

                systemUiController.setSystemBarsColor(
                    color = Color.Transparent,
                    darkIcons = !darkTheme
                )

                systemUiController.setNavigationBarColor(
                    color = colorScheme.surface,
                    darkIcons = !darkTheme
                )
            }
        }
    }
}

// Enhanced color schemes
private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = Primary.copy(alpha = 0.1f),
    onPrimaryContainer = Primary,
    secondary = Secondary,
    onSecondary = Color.White,
    secondaryContainer = Secondary.copy(alpha = 0.1f),
    onSecondaryContainer = Secondary,
    tertiary = Secondary,
    onTertiary = Color.White,
    tertiaryContainer = Secondary.copy(alpha = 0.1f),
    onTertiaryContainer = Secondary,
    error = Error,
    onError = Color.White,
    errorContainer = Error.copy(alpha = 0.1f),
    onErrorContainer = Error,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black,
    surfaceVariant = Color(0xFFF5F5F5),
    onSurfaceVariant = Color(0xFF666666),
    outline = Color(0xFFE0E0E0),
    outlineVariant = Color(0xFFF0F0F0),
    scrim = Color.Black.copy(alpha = 0.32f),
    inverseSurface = Color.Black,
    inverseOnSurface = Color.White,
    inversePrimary = Primary.copy(alpha = 0.8f)
)

private val DarkColorScheme = darkColorScheme(
    primary = Primary.copy(alpha = 0.8f),
    onPrimary = Color.Black,
    primaryContainer = Primary.copy(alpha = 0.2f),
    onPrimaryContainer = Primary.copy(alpha = 0.9f),
    secondary = Secondary.copy(alpha = 0.8f),
    onSecondary = Color.Black,
    secondaryContainer = Secondary.copy(alpha = 0.2f),
    onSecondaryContainer = Secondary.copy(alpha = 0.9f),
    tertiary = Secondary.copy(alpha = 0.8f),
    onTertiary = Color.Black,
    tertiaryContainer = Secondary.copy(alpha = 0.2f),
    onTertiaryContainer = Secondary.copy(alpha = 0.9f),
    error = Error.copy(alpha = 0.8f),
    onError = Color.Black,
    errorContainer = Error.copy(alpha = 0.2f),
    onErrorContainer = Error.copy(alpha = 0.9f),
    background = Color(0xFF121212),
    onBackground = Color(0xFFE1E1E1),
    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFE1E1E1),
    surfaceVariant = Color(0xFF2A2A2A),
    onSurfaceVariant = Color(0xFFB3B3B3),
    outline = Color(0xFF404040),
    outlineVariant = Color(0xFF303030),
    scrim = Color.Black.copy(alpha = 0.5f),
    inverseSurface = Color(0xFFE1E1E1),
    inverseOnSurface = Color(0xFF121212),
    inversePrimary = Primary
)

// Custom theme extensions
@Composable
fun MaterialTheme.customColors(): CustomColors {
    return if (isSystemInDarkTheme()) {
        CustomColors(
            success = Color(0xFF4CAF50),
            onSuccess = Color.White,
            warning = Color(0xFFFF9800),
            onWarning = Color.White,
            info = Color(0xFF2196F3),
            onInfo = Color.White,
            cardBackground = Color(0xFF2A2A2A),
            onCardBackground = Color(0xFFE1E1E1),
            divider = Color(0xFF404040),
            shimmer = Color(0xFF3A3A3A)
        )
    } else {
        CustomColors(
            success = Color(0xFF4CAF50),
            onSuccess = Color.White,
            warning = Color(0xFFFF9800),
            onWarning = Color.White,
            info = Color(0xFF2196F3),
            onInfo = Color.White,
            cardBackground = Color.White,
            onCardBackground = Color(0xFF1C1C1C),
            divider = Color(0xFFE0E0E0),
            shimmer = Color(0xFFF5F5F5)
        )
    }
}

data class CustomColors(
    val success: Color,
    val onSuccess: Color,
    val warning: Color,
    val onWarning: Color,
    val info: Color,
    val onInfo: Color,
    val cardBackground: Color,
    val onCardBackground: Color,
    val divider: Color,
    val shimmer: Color
)
