FROM adoptopenjdk/openjdk11:jdk-11.0.2.7-alpine-slim
#FROM openjdk:11.0.8-jre-slim-buster
#11-jdk-slim
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]