FROM openjdk:17
EXPOSE 8761

ADD target/mediconnect-user-registry.jar mediconnect-user-registry.jar
ENTRYPOINT ["java","-jar","/mediconnect-user-registry.jar"]


# Use the official OpenJDK image as a parent image
