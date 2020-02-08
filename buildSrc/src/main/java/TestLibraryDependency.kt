object TestLibraryVersion{
    const val JUNIT = "4.13"
    const val JUNIT_ANDROID = "1.1.1"
    const val ESPRESSO = "3.2.0"
}

object TestLibraryDependency{
    const val JUNIT = "junit:junit:${TestLibraryVersion.JUNIT}"
    const val JUNIT_ANDROID = "androidx.test.ext:junit:${TestLibraryVersion.JUNIT_ANDROID}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${TestLibraryVersion.ESPRESSO}"
}