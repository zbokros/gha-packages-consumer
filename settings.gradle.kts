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
        maven {
            name = "GitHubPackages"

            // Replace GITHUB_USERID with your personal or organisation user ID and
            // REPOSITORY with the name of the repository on GitHub
            url = uri("https://maven.pkg.github.com/zbokros/github-packages-demo")

            credentials {
                username = "22410777"
                password = "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"
            }
        }
    }
}


rootProject.name = "My Application"
include(":app")
