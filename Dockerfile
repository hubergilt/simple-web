FROM maven:3.9.0-eclipse-temurin-17-alpine

WORKDIR /usr/local/simple-webapp

COPY . .

EXPOSE 8080

CMD [ "mvn", "tomcat9:run" ]