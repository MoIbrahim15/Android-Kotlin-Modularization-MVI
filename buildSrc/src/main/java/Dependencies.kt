object Versions {
    const val kotlin = "1.3.61"
    const val support_lib = "1.1.0"
    const val constraint = "1.1.3"
    const val navigation = "2.2.0"
    const val junit = "4.13"
    const val junit_android = "1.1.1"
    const val espresso = "3.2.0"
    const val ANDROID_GRADLE = "4.0.0-alpha09"
}

object Libraries {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val core = "androidx.core:core-ktx:${Versions.support_lib}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.support_lib}"
    const val material = "com.google.android.material:material:${Versions.support_lib}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val junit_android = "androidx.test.ext:junit:${Versions.junit_android}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}


object ClasspathDependency {
    const val KOTLIN = "gradle-plugin"
    const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE}"
    const val SAFE_ARGS = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
}

object GradlePluginId {
    const val ANDROID_APP = "com.android.application"
    const val ANDROID = "android"
    const val ANDROID_EXT = "android.extensions"
    const val SAFE_ARGS = "androidx.navigation.safeargs"
}