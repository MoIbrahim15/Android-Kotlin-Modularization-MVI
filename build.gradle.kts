// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath (ClasspathDependency.ANDROID_GRADLE)
        classpath(kotlin(ClasspathDependency.KOTLIN, version = Versions.kotlin))
        classpath (ClasspathDependency.SAFE_ARGS)

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

tasks {
    val clean by registering(Delete::class) {
        delete (buildDir)
    }
}