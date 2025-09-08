FROM maven:3.9.11-eclipse-temurin-21-alpine AS build
COPY . .
RUN mvn clean package -Dmaven.test.skip=true

FROM openjdk:21-jdk-slim
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]