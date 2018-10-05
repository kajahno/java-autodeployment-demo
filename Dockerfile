FROM maven:3-jdk-8-alpine as builder

WORKDIR /code

COPY . /code

RUN mvn clean install

#Second stage

FROM openjdk:8-alpine

copy --from=builder /code/target/java-autodeployment-demo-0.0.1-SNAPSHOT.jar /

CMD ["java", "-jar", "java-autodeployment-demo-0.0.1-SNAPSHOT.jar"]

