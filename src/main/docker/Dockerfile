#!bin/bash
FROM anapsix/alpine-java:8
VOLUME /tmp
ADD test-ci.jar test-ci.jar
RUN bash -c 'touch /test-ci.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test-ci.jar"]