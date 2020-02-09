object CoreVersion{
    const val KOTLIN = "1.3.61"
    const val NAVIGATION = "2.2.0"
    const val ANDROID_GRADLE = "4.0.0-alpha09"
}

object GradlePluginId {
    const val ANDROID_LIB  = "com.android.library"
    const val ANDROID_APP = "com.android.application"
    const val ANDROID = "android"
    const val ANDROID_EXT = "android.extensions"
    const val SAFE_ARGS = "androidx.navigation.safeargs"
}

object GradleClasspath {
    const val KOTLIN_PlUGIN = "gradle-plugin"
    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${CoreVersion.ANDROID_GRADLE}"
    const val SAFE_ARGS = "androidx.navigation:navigation-safe-args-gradle-plugin:${CoreVersion.NAVIGATION}"
}
