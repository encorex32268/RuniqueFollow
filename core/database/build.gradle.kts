plugins {
    alias(libs.plugins.runiquefollow.android.library)
    alias(libs.plugins.runiquefollow.android.room)
}

android {
    namespace = "com.lihan.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}