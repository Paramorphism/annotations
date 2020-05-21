plugins {
    java
}

group = "dev.paramorphism"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
