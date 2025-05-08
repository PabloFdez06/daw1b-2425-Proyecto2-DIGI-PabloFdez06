plugins {
    kotlin("jvm") version "1.8.10"
    id("org.jetbrains.dokka") version "1.9.10"
    application
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.dokkaHtml {
    outputDirectory.set(buildDir.resolve("dokka"))
}

application {
    mainClass.set("MainKt")
}


kotlin {
    jvmToolchain(19)
}
