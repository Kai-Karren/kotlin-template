FROM gradle:jdk17-alpine as build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
COPY . .
RUN gradle build --no-daemon

FROM gcr.io/distroless/java17-debian11
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/kotlin-template-1.0-SNAPSHOT.jar .
CMD ["kotlin-template-1.0-SNAPSHOT.jar"]