FROM java
WORKDIR /app
ADD target/GearEE-Baker-Auto-Conf-Service-*.jar /app/app.jar
EXPOSE 8888
SHELL ["java", "-jar", "app.jar"]
