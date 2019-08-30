FROM openjdk:latest

# Add Maintainer Info
LABEL maintainer="ckjha101@gmail.com"


ADD target/SMC-SignupLogin.jar SMC-SignupLogin.jar

# Make port 8084 available to the world outside this container
EXPOSE 8084

# Run the jar file 
ENTRYPOINT ["java","-jar","SMC-SignupLogin.jar"]