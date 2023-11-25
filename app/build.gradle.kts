plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.xtv.app"
    compileSdkPreview = "TiramisuPrivacySandbox"

    defaultConfig {
        applicationId = "com.xtv.app"
        minSdkPreview = "21"
        targetSdkPreview = "21"
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.leanback:leanback:1.0.0")
    implementation("com.github.bumptech.glide:glide:4.11.0")
}