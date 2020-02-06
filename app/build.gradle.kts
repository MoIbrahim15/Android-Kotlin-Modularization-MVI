plugins {
    id(GradlePluginId.ANDROID_APP)
    kotlin(GradlePluginId.ANDROID)
    kotlin(GradlePluginId.ANDROID_EXT)
    id(GradlePluginId.SAFE_ARGS)
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion(AndroidConfig.BUILD_TOOLS_VERSION)

    defaultConfig {
        applicationId = AndroidConfig.ID
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER

    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        val options = this as? org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options?.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.appcompat)
    implementation(Libraries.core)
    implementation(Libraries.material)
    implementation(Libraries.constraint)
    implementation(Libraries.navigation_fragment)
    implementation(Libraries.navigation_ui)
    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.junit_android)
    androidTestImplementation(TestLibraries.espresso)
}