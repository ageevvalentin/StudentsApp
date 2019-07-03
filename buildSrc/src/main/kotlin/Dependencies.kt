object Dependencies {
    object BuildPlugin {
        const val Kotlin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
        const val Android =
            "com.android.tools.build:gradle:${Versions.Android.GradlePlugin}"
    }

    object Kotlin {
        const val StdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin}"
        const val Reflection = "org.jetbrains.kotlin:kotlin-reflect:${Versions.Kotlin}"
    }

    object AndroidX {
        const val Core = "androidx.core:core-ktx:${Versions.AndroidX.Core}"
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.AppCompat}"
        const val Activity = "androidx.activity:activity:${Versions.AndroidX.Activity}"
        const val Fragment = "androidx.fragment:fragment:${Versions.AndroidX.Fragment}"
        const val RecyclerView =
            "androidx.recyclerview:recyclerview:${Versions.AndroidX.RecyclerView}"

        object KTX {
            const val Core = "androidx.core:core-ktx:${Versions.AndroidX.Core}"
            const val Activity = "androidx.activity:activity-ktx:${Versions.AndroidX.Activity}"
            const val Fragment = "androidx.fragment:fragment-ktx:${Versions.AndroidX.Fragment}"
        }
    }

    object DI {
        object Kodein {
            const val Core = "org.kodein.di:kodein-di-generic-jvm:${Versions.DI.Kodein}"
            const val AndroidX = "org.kodein.di:kodein-di-framework-android-x:${Versions.DI.Kodein}"
        }
    }

    object Test {
        const val JUnit = "junit:junit:${Versions.Test.JUnit}"
        const val Runner = "androidx.test:runner:${Versions.Test.Runner}"
        const val Espresso = "androidx.test.espresso:espresso-core:${Versions.Test.Espresso}"
    }
}