plugins {
    kotlin("jvm") version "2.2.20"
}

group = "io.template"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    "implementation"("org.jetbrains.kotlin:kotlin-stdlib:2.2.20")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "io.template.MainKt"
    }
}
