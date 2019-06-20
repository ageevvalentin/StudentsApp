object Dependencies {
    object BuildPlugin {
        const val Kotlin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
        const val Android =
            "com.android.tools.build:gradle:${Versions.Android.GradlePlugin}"
    }

    object Kotlin {
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin}"
    }

    object AndroidX {
        const val Core = "androidx.core:core-ktx:${Versions.AndroidX.Core}"
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.AppCompat}"
    }

    object Test {
        const val JUnit = "junit:junit:${Versions.Test.JUnit}"
        const val Runner = "androidx.test:runner:${Versions.Test.Runner}"
        const val Espresso = "androidx.test.espresso:espresso-core:${Versions.Test.Espresso}"
    }
}