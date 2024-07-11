plugins {
    alias(libs.plugins.runiquefollow.android.library)
    alias(libs.plugins.runiquefollow.jvm.ktor)

}

android {
    namespace = "com.lihan.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}