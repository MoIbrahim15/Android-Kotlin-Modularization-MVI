apply (from = "$rootDir/${GradlePluginId.BASE_GRADLE}")

plugins {
    id(GradlePluginId.ANDROID_APP)
}
dependencies {
    implementation (project(ModulesDependency.NAVIGATION))
    implementation (project(ModulesDependency.DASHBOARD))
}