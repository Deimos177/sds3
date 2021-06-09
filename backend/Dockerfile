FROM openjdk
ADD target/sds-docker.jar sds-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "sds-docker.jar"]