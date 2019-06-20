plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}

repositories {
    mavenCentral()
}

project.version = "0.1"

kotlin {
    jvm()

    val buildForDevice = project.findProperty("kotlin.native.cocoapods.target") == "ios_arm"
    if (buildForDevice) {
        iosArm64("iOS64")
        iosArm32("iOS32")

        val commonMain by sourceSets.creating
        sourceSets["iOS64Main"].dependsOn(commonMain)
        sourceSets["iOS32Main"].dependsOn(commonMain)
    } else {
        iosX64("iOS")
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }

    cocoapods {
        summary = "Commons"
        homepage = "Commons"
    }
}