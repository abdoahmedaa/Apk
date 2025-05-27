package com.focusflow.app.ui.components.animations;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0006H\u0007\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\u0002\b\u0006H\u0007\u001ac\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112;\u0010\u0004\u001a7\u0012\u0013\u0012\u0011H\r\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0006H\u0007\u001a.\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0003H\u0007\u001a\u0016\u0010\u001e\u001a\u00020\u0018*\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0003H\u0007\u001a\f\u0010\u001f\u001a\u00020\u0018*\u00020\u0018H\u0007\u00a8\u0006 "}, d2 = {"CrossFadeTransition", "", "targetState", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "SlideInFromDirection", "direction", "Lcom/focusflow/app/ui/components/animations/SlideDirection;", "visible", "Lkotlin/Function0;", "StaggeredAnimatedList", "T", "items", "", "staggerDelay", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "index", "bouncyClick", "Landroidx/compose/ui/Modifier;", "enabled", "hapticEnabled", "onClick", "fabAnimation", "extended", "pulseAnimation", "shimmerEffect", "app_debug"})
public final class AnimationUtilsKt {
    
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.Modifier bouncyClick(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier $this$bouncyClick, boolean enabled, boolean hapticEnabled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.Modifier shimmerEffect(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier $this$shimmerEffect) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SlideInFromDirection(@org.jetbrains.annotations.NotNull()
    com.focusflow.app.ui.components.animations.SlideDirection direction, boolean visible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.Modifier pulseAnimation(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier $this$pulseAnimation, boolean enabled) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void StaggeredAnimatedList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, int staggerDelay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.ui.Modifier fabAnimation(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier $this$fabAnimation, boolean extended) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CrossFadeTransition(boolean targetState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> content) {
    }
}