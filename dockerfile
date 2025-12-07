FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN mkdir -p out && javac -d out Main.java

CMD ["java", "-cp", "out", "Main"]
