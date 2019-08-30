
FROM openjdk:latest

# Add Maintainer Info
LABEL maintainer="ckjha101@gmail.com"


ADD target/SMC-BusinessRequirement.jar SMC-BusinessRequirement.jar

# Make port 8082 available to the world outside this container
EXPOSE 8082

# Run the jar file 
ENTRYPOINT ["java","-jar","SMC-BusinessRequirement.jar"]

