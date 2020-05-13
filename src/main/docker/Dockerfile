FROM openjdk:8-jdk-alpine

RUN apk update && apk upgrade

RUN mkdir -p /usr/local/app

ADD  management-service.jar /usr/local/app/

CMD java -jar -Dspring.profiles.active=dev /usr/local/app/management-service.jar