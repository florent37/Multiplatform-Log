#!/usr/bin/env bash
./gradlew clean
./gradlew build
./gradlew :multiplatform-log-ios:publishToMavenLocal
./gradlew :multiplatform-log-android:publishToMavenLocal
./gradlew :publishToMavenLocal
./gradlew bintrayUpload
