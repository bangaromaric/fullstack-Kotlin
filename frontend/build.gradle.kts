plugins {
    kotlin("js") version "1.5.30"
}

group = "ga.banga"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
                outputFileName = "kotlin.js"
            }
            distribution {
                directory = File("/home/banga/dev/kotlin/fullStack/backend/src/main/resources/static/js/")
            }
        }
    }
}