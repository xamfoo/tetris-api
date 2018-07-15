plugins {
    application
    kotlin("jvm") version "1.2.51"
}

application {
    mainClassName = "rest.MainKt"
}

group = "com.code-challenge"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compile(kotlin("stdlib"))
    compile("com.google.code.gson:gson:2.8.4")
    compile("org.slf4j:slf4j-simple:1.7.25")
    compile("com.sparkjava:spark-core:2.5.5")
    testCompile("com.despegar:spark-test:1.1.8")
    testCompile("junit:junit:4.12")
}

repositories {
    jcenter()
}
