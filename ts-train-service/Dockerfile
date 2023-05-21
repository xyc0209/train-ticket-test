FROM java:8-jre


ADD ./ts-train-service-1.0.jar /app/
CMD ["java", "-Xmx200m",  "-jar", "/app/ts-train-service-1.0.jar"]

EXPOSE 14567