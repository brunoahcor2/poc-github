# FROM eclipse-temurin:17

# VOLUME /tmp

# ADD ./target/*.jar /app/app.jar

# ENTRYPOINT ["java","-jar","/app/app.jar"]


FROM eclipse-temurin:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]