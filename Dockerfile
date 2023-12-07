FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp

RUN mkdir /proj
WORKDIR /proj

COPY . /proj
# ENTRYPOINT ["java","-jar","/app.jar"]