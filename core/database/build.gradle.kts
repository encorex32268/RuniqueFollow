plugins {
    alias(libs.plugins.runiquefollow.android.library)

}

android {
    namespace = "com.lihan.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}