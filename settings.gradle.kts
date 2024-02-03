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
        // maven(url = "https://jitpack.io")
        maven {
            url = uri("https://jitpack.io")
            credentials {
                username = "jp_ei43nusdabeipct1788b0vku4r"
            }
        }
    }
}

rootProject.name = "TestJitpack"
include(":app")
include(":helikanontestlib")
