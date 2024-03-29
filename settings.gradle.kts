pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ru.mirea.Bykonya.Lesson4"
include(":app")
include(":app:task1")
include(":app:audioplayer")
include(":app:thread")
include(":app:data_thread")
include(":app:looper")
include(":app:cryptoloader")
include(":app:serviceapp")
include(":app:workmanager")
