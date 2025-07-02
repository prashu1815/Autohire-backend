# Use Eclipse Temurin JDK 21 as base image
FROM eclipse-temurin:21-jdk

# Set working directory in container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/AutoHire-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app will run on
EXPOSE 10000

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
