// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath (GradleClasspath.ANDROID_GRADLE)
        classpath (kotlin(GradleClasspath.KOTLIN_PlUGIN, version = CoreVersion.KOTLIN))
        classpath (GradleClasspath.SAFE_ARGS)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}