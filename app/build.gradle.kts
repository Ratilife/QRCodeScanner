plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.ratilife.qrcodescanner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ratilife.qrcodescanner"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.vision.common)
    implementation(libs.play.services.mlkit.barcode.scanning)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Добавить зависимости CameraX и ML Kit
    implementation ("androidx.camera:camera-core:1.1.0-beta02")
    implementation ("androidx.camera:camera-camera2:1.1.0-beta02")
    implementation ("androidx.camera:camera-lifecycle:1.1.0-beta02")
    implementation ("androidx.camera:camera-video:1.1.0-beta02")
    implementation ("androidx.camera:camera-view:1.1.0-beta02")
    implementation ("androidx.camera:camera-extensions:1.1.0-beta02")
    //implementation("com.google.mlkit:version-common:17.1.0") // ml-kit добавлено для InputImage
    //implementation("com.google.android.gms:play-services-mlkit-barcode-scanning:18.3.1") // добавил bar code scanner
}