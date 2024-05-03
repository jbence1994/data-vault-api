FROM openjdk:17-alpine

WORKDIR /data_vault_api

COPY target/*.jar ./app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/data_vault_api/app.jar"]
