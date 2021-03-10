FROM openjdk:8-jdk-alpine
LABEL maintainer="mamoudouba8787@gmail.com"
VOLUME /tmp
EXPOSE 8082
COPY build/libs/trippricer_api-1.0.0.jar trippricer.jar
ENTRYPOINT ["java","-jar","trippricer.jar"]