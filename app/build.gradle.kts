plugins {
    id(GradlePluginId.ANDROID_APP)
    id(GradlePluginId.BASE_GRADLE_PLUGIN)
}

dependencies {
    implementation (project(ModulesDependency.NAVIGATION))
    implementation (project(ModulesDependency.DASHBOARD))
}