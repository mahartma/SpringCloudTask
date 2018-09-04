FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/Spring-Cloud-Task-Sample-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]