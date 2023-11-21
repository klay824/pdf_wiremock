FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/wiremock.jar"]
ENTRYPOINT ["java","-jar","/wiremock.jar"]
EXPOSE 8090