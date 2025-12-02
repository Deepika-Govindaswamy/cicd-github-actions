
FROM openjdk:17-jdk

WORKDIR /app

COPY /target/springboot-cicd-actions.jar /app/springboot-cicd-actions.jar

EXPOSE 8080

CMD ["java", "-jar", "springboot-cicd-actions.jar"]