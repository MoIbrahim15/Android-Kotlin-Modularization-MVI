apply (from = "$rootDir/${GradlePluginId.BASE_GRADLE}")

plugins {
    id(GradlePluginId.ANDROID_APP)
}

dependencies {
    implementation (project(":dashboard"))
    implementation (project(":navigation"))
}