# Etapa 1: build
FROM ubuntu:latest AS build
LABEL authors="miran"

# Instalar dependências
RUN apt-get update && apt-get install -y openjdk-21-jdk maven

WORKDIR /app
COPY . .

# Gerar o .jar
RUN mvn clean package -DskipTests

# Etapa 2: imagem final
FROM openjdk:21-jdk-slim
WORKDIR /app

EXPOSE 8080

# Copiar o .jar gerado do build
COPY --from=build /app/target/*.jar app.jar

# Rodar o jar
ENTRYPOINT ["java", "-jar", "app.jar"]
