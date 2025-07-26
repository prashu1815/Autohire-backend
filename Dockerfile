# Step 1: Use a base image with Java
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Add the JAR file to the container
# Replace `demo-0.0.1-SNAPSHOT.jar` with your actual JAR name
COPY target/AutoHire-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
