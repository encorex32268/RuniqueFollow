plugins {
    alias(libs.plugins.runiquefollow.android.library)
    alias(libs.plugins.runiquefollow.jvm.ktor)

}

android {
    namespace = "com.lihan.auth.data"
}

dependencies {

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}