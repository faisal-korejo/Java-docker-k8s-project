FROM openjdk:17-jdk-slim
COPY target/product-catalogue-1.0-SNAPSHOT.jar app.jar
COPY src/main/resources/config.yml config.yml
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar", "server", "config.yml"]
