FROM maven:3.3.3-jdk-8

ENV MAVEN_SETTINGS /usr/share/maven/conf/settings.xml

CMD ["mvn"]
