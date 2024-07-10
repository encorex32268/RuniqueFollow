plugins {
    alias(libs.plugins.runiquefollow.android.feature.ui)
}

android {
    namespace = "com.lihan.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}