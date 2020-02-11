object LibraryDependency {
    object Version {
        const val SUPPORT_LIB = "1.1.0"
        const val CONSTRAINT = "1.1.3"
    }

    const val KOTLIN_STD = "org.jetbrains.kotlin:kotlin-stdlib:${CoreVersion.KOTLIN}"
    const val CORE = "androidx.core:core-ktx:${Version.SUPPORT_LIB}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Version.SUPPORT_LIB}"
    const val MATERIAL = "com.google.android.material:material:${Version.SUPPORT_LIB}"
    const val CONSTRAINT = "androidx.constraintlayout:constraintlayout:${Version.CONSTRAINT}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${CoreVersion.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${CoreVersion.NAVIGATION}"
}