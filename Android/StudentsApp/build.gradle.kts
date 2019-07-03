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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Dependencies.Kotlin.StdLib)

    implementation(Dependencies.AndroidX.AppCompat)
    implementation(Dependencies.AndroidX.Core)
    implementation(Dependencies.AndroidX.KTX.Core)
    implementation(Dependencies.AndroidX.Activity)
    implementation(Dependencies.AndroidX.KTX.Activity)
    implementation(Dependencies.AndroidX.Fragment)
    implementation(Dependencies.AndroidX.KTX.Fragment)
    implementation(Dependencies.AndroidX.RecyclerView)


    implementation(Dependencies.DI.Kodein.Core)
    implementation(Dependencies.DI.Kodein.AndroidX)

    testImplementation(Dependencies.Test.JUnit)
    androidTestImplementation(Dependencies.Test.Runner)
    androidTestImplementation(Dependencies.Test.Espresso)

    implementation(project(":Commons"))
}
