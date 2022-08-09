FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=swagger-spring-1.0.0.jar
COPY /target/${JAR_FILE} application.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "application.jar"]