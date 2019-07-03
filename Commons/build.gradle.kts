import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

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

    val iosConfigure: KotlinNativeTarget.() -> Unit = {
        binaries {
            NativeBuildType.DEFAULT_BUILD_TYPES.forEach {
                getFramework(it).freeCompilerArgs.add("-Xobjc-generics")
            }
        }
    }

    val buildForDevice = project.findProperty("kotlin.native.cocoapods.target") == "ios_arm"
    if (buildForDevice) {
        iosArm64("iOS64", iosConfigure)
        iosArm32("iOS32", iosConfigure)

        val commonMain by sourceSets.creating
        sourceSets["iOS64Main"].dependsOn(commonMain)
        sourceSets["iOS32Main"].dependsOn(commonMain)
    } else {
        iosX64("iOS", iosConfigure)
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(Dependencies.Kotlin.StdLib)
                implementation(Dependencies.Kotlin.Reflection)
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("io.mockk:mockk:1.9.3")
            }
        }
    }

    cocoapods {
        summary = "Commons"
        homepage = "Commons"
    }
}