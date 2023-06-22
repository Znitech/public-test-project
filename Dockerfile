FROM maven:3.9.2-eclipse-temurin-17 as maven-build

WORKDIR /tmp

COPY src /tmp/src
COPY pom.xml /tmp

RUN mvn clean package -Dpackaging=jar
RUN rm target/original-*


######################################
# App Run
######################################
FROM eclipse-temurin:17.0.7_7-jre-jammy

COPY --from=maven-build /tmp/target/*.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
