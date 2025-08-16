# Stage 1: The Build Stage
FROM openjdk:17-jdk-slim AS builder
WORKDIR /app

# Copy the pom.xml and the project source
COPY pom.xml .
COPY src ./src

# Use Maven to build the application into a JAR file
RUN apt-get update && apt-get install -y maven
RUN mvn clean install -DskipTests

# Stage 2: The Runtime Stage
FROM openjdk:17-jre-slim
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the application's port (e.g., 8080 for Spring Boot)
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
