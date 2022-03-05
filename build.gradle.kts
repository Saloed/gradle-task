plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation ("com.google.guava:guava:31.0.1-jre")

}

tasks.test {
    useJUnitPlatform()
}
