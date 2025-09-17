FROM openjdk:17-jdk-slim

# Create a working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Set the entrypoint
ENTRYPOINT ["java", "-jar", "app.jar"]
