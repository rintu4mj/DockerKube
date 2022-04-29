FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-mysql-microservice.jar
ENTRYPOINT ["java","-jar","/docker-mysql-microservice.jar"]
ENV PORT 8085
EXPOSE 8085