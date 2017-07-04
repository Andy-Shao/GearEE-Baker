FROM java
WORKDIR /app
ADD GearEE-Baker-Auto-Conf-Service-*.jar /app/app.jar
EXPOSE 8888
CMD ["java", "-Dspring.profiles.active=dev", "-jar", "app.jar"]
