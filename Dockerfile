FROM openjdk:11-jdk-slim
WORKDIR /app
COPY target/project-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar
EXPOSE 8080  
ENTRYPOINT ["java", "-jar", "app.jar"]
