FROM tomcat:8.0.20-jre8

MAINTAINER ramonqueiroga

COPY ./target/listavip-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/listavip.war

CMD ["catalina.sh", "run"]