FROM openjdk:23-jdk-slim
WORKDIR /app
COPY target/api-0.0.1-SNAPSHOT.jar /app/api-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENV MONGO_URI=mongodb://mongodb:27017/apidb
ENTRYPOINT ["java", "-jar", "/app/api-0.0.1-SNAPSHOT.jar"]