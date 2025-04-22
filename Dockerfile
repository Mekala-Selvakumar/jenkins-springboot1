# use openJDK17 runtime
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR  /usr/src

# Add the spring boot JAR
ADD  ./target/jenkins-springboot1-0.0.1-SNAPSHOT.jar  /usr/src/jenkins-springboot1-0.0.1-SNAPSHOT.jar

#Run the application
ENTRYPOINT ["java", "-jar",  "/usr/src/jenkins-springboot1-0.0.1-SNAPSHOT.jar"]
