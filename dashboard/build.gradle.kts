plugins {
    id(GradlePluginId.ANDROID_LIB)
    id(GradlePluginId.BASE_GRADLE_PLUGIN)
    id(GradlePluginId.SAFE_ARGS)
}

android {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
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