plugins {
    kotlin("jvm") version "1.6.10"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:31.0.1-jre")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

