docker run -it --rm -p 8080:8080 --name run_maven -v /home/huber/wd/maven/simple-webapp:/usr/src/simple-webapp -w /usr/src/simple-webapp maven:3.9.0-eclipse-temurin-17-alpine mvn tomcat9:run
