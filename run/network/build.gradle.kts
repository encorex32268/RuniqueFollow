plugins {
    alias(libs.plugins.runiquefollow.android.library)
    alias(libs.plugins.runiquefollow.jvm.ktor)

}

android {
    namespace = "com.lihan.run.network"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(projects.core.domain)
    implementation(projects.core.data)
}