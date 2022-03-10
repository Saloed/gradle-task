plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    implementation("com.google.guava:guava:31.0.1-jre")
}
tasks.test {
    useJUnitPlatform()
}