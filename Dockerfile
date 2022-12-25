FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-pipeline2.jar docker-jenkins-pipeline2.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-pipeline2.jar"]