FROM openjdk:17-jdk-alpine
WORKDIR  /app
COPY ./target/DockerMysql-0.0.1-SNAPSHOT.jar  /app/app1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app1.jar"]