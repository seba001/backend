FROM amazoncorretto:17-alpine-jdk
MAINTAINER sebastian
COPY targe/arprog-0.0.1-SNAPSHOT.jar proyecto.jar
ENTRYPOINT ["java","-jar","/proyecto.jar"]