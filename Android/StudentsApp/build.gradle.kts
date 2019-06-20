plugins {
    id("com.android.application")
    kotlin("android")
}

repositories {
    google()
    mavenCentral()
    jcenter()
}

android {
    compileSdkVersion(Versions.Android.SDK.Compile)
    defaultConfig {
        applicationId = "com.example.studentsapp"
        minSdkVersion(Versions.Android.SDK.Minimal)
        targetSdkVersion(Versions.Android.SDK.Target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Dependencies.Kotlin.StdLib)

    implementation(Dependencies.AndroidX.AppCompat)
    implementation(Dependencies.AndroidX.Core)

    testImplementation(Dependencies.Test.JUnit)
    androidTestImplementation(Dependencies.Test.Runner)
    androidTestImplementation(Dependencies.Test.Espresso)

    implementation(project(":Commons"))
}
