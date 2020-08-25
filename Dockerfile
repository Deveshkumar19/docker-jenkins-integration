 FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-code.jar
ENTRYPOINT ["java","-jar","docker-code.jar"]