FROM openjdk:17-jdk-slim-buster

WORKDIR /appdir

COPY build/libs/springapp-0.0.1-SNAPSHOT.jar /appdir/app.jar

ENTRYPOINT ["java", "-jar", "/appdir/app.jar"]