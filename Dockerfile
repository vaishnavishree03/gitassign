FROM openjdk:17
COPY target/assignmenttesting-1.0.jar /app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar && sleep infinity"]