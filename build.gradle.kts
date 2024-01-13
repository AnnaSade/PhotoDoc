
plugins {
    kotlin("jvm") version "1.9.0"
    antlr
    // id("org.antlr") version "1.22"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    //implementation("org.antlr:antlr4:4.9.2")
    implementation("org.antlr:antlr4:4.5")
}
/*dependencies {
    testImplementation(kotlin("test"))

}*/


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    dependsOn("generateGrammarSource")
}