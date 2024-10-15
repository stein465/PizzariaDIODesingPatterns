FROM openjdk:17-jdk-alpine AS build

WORKDIR /app/pizzaria

COPY . .

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-alpine

WORKDIR /app/pizza

COPY --from=build /app/pizzaria/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080



