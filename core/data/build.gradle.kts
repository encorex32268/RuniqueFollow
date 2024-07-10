plugins {
    alias(libs.plugins.runiquefollow.android.library)
}

android {
    namespace = "com.lihan.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}