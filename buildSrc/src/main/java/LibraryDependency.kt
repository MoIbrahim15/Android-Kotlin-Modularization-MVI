object LibraryVersion {
    const val SUPPORT_LIB = "1.1.0"
    const val CONSTRAINT = "1.1.3"
}

object LibraryDependency {
    const val KOTLIN_STD = "org.jetbrains.kotlin:kotlin-stdlib:${CoreVersion.KOTLIN}"
    const val CORE = "androidx.core:core-ktx:${LibraryVersion.SUPPORT_LIB}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${LibraryVersion.SUPPORT_LIB}"
    const val MATERIAL = "com.google.android.material:material:${LibraryVersion.SUPPORT_LIB}"
    const val CONSTRAINT = "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${CoreVersion.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${CoreVersion.NAVIGATION}"
}