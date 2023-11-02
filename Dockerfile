FROM openjdk:8
EXPOSE 8080
ADD target/techie.jar techie.jar
ENTRYPOINT ["java", "-jar","/techie.jar"]