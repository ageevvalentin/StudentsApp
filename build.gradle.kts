buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath(Dependencies.BuildPlugin.Kotlin)
        classpath(Dependencies.BuildPlugin.Android)
    }
}