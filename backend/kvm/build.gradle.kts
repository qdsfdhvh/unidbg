/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.github.zhkl0228.java-conventions")
}

dependencies {
    api(project(":unidbg-api"))
}

description = "unidbg-kvm"

java {
    withJavadocJar()
}
