import com.android.build.api.dsl.ApplicationExtension
import com.lihan.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply(
                "runiquefollow.android.application"
            )
            val extensions = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extensions)
        }
    }

}