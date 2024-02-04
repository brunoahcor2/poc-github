FROM eclipse-temurin:17-jre

VOLUME /tmp

ADD ./target/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]