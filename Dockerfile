FROM payara/micro
#RUN wget -O /opt/payara/postgresql-42.2.2.jar https://jdbc.postgresql.org/download/postgresql-42.2.2.jar

ADD Tester.war /opt/payara
#ADD connectionPool.txt /opt/payara
  
ENTRYPOINT ["java", "-jar", "/opt/payara/payara-micro.jar", "--deploy", "/opt/payara/Tester.war"]
#ENTRYPOINT /bin/sh


