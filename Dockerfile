# Use the official Oracle OpenJDK 20.0.2 as the base image
FROM oracle/openjdk:20.0.2

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/SpringbootBasics-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8081

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
