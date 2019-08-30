
FROM openjdk:latest

# Add Maintainer Info
LABEL maintainer="ckjha101@gmail.com"


ADD target/SMC-App.jar SMC-App.jar

# Make port 8086 available to the world outside this container
EXPOSE 8086

# Run the jar file 
ENTRYPOINT ["java","-jar","SMC-App.jar"]




