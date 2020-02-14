rootProject.buildFileName = "build.gradle.kts"

// this gradle version has an issue with settings kts file to read from constants
include(
    ":app",
    ":navigation",
    ":dashboard"
)
