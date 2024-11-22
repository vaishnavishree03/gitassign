FROM openjdk:17
COPY target/assignmenttesting-1.0.jar /assignmenttesting.jar
ENTRYPOINT ["sh", "-c", "java -jar /assignmenttesting.jar && sleep infinity"]