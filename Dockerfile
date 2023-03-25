FROM amazoncorretto:17-alpine-jdk
MAINTAINER sebastian
COPY target/arprog-0.0.1-SNAPSHOT.jar proyecto.jar
ENTRYPOINT ["java","-jar","/proyecto.jar"]
EXPOSE 8080