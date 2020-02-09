apply (from = "$rootDir/${GradlePluginId.BASE_GRADLE}")

plugins {
    id(GradlePluginId.ANDROID_LIB)
    id(GradlePluginId.SAFE_ARGS)
}

android {
    defaultConfig {
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }
}

dependencies {
    implementation(LibraryDependency.APPCOMPAT)
    implementation(LibraryDependency.CORE)
    implementation(LibraryDependency.MATERIAL)
    implementation(LibraryDependency.CONSTRAINT)
    implementation(LibraryDependency.NAVIGATION_FRAGMENT)
    implementation(LibraryDependency.NAVIGATION_UI)

    testImplementation(TestLibraryDependency.JUNIT)
    androidTestImplementation(TestLibraryDependency.JUNIT_ANDROID)
    androidTestImplementation(TestLibraryDependency.ESPRESSO)
}