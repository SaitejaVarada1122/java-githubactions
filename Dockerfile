FROM eclipse-temurin:17

WORKDIR /app

COPY /target/java-githubactions.jar /app/java-githubactions.jar

EXPOSE 8080

ENTRYPOINT [ "java","-jar","java-githubactions.jar" ]