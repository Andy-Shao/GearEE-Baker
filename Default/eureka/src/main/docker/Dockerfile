FROM java
WORKDIR /app
ADD GearEE-Baker-Register-Service-*.jar /app/app.jar
CMD ["java", "-Dspring.profiles.active=dev", "-jar", "app.jar"]
