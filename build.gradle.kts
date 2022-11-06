plugins {
    kotlin("jvm") version "1.7.20"
}

group = "io.template"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "io.template.MainKt"
    }
}
