FROM openjdk:17
EXPOSE 8080
ADD target/testing-yaml.jar testing-yaml.jar 
ENTRYPOINT ["java","-jar","/testing-yaml.jar"]