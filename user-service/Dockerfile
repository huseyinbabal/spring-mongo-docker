FROM java:openjdk-8u91-jdk
MAINTAINER Huseyin BABAL <huseyinbabal88@gmail.com>

WORKDIR /usr/src/app

ADD build/libs/*.jar ./app.jar
ADD docker/*.sh .

EXPOSE 8080

ENTRYPOINT ["sh", "start_service.sh"]