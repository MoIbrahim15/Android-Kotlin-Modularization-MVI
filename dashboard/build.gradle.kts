plugins {
    id(GradlePluginId.ANDROID_LIB)
    id(GradlePluginId.BASE_GRADLE_PLUGIN)
    id(GradlePluginId.SAFE_ARGS)
}

dependencies {
    implementation(LibraryDependency.APPCOMPAT)
    implementation(LibraryDependency.CORE)
    implementation(LibraryDependency.MATERIAL)
    implementation(LibraryDependency.CONSTRAINT)
    implementation(LibraryDependency.NAVIGATION_FRAGMENT)
    implementation(LibraryDependency.NAVIGATION_UI)

    addTestDependencies()
}