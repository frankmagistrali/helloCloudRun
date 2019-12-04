#
#FROM java:8
#WORKDIR /
##RUN sbt update
#ADD /target/scala-2.13/yoworld_2.13-0.1.jar yoworld_2.13-0.1.jar
#EXPOSE 8080
#CMD java -jar yoworld_2.13-0.1.jar
#RUN export SBT_VERSION=1.3.4
FROM openjdk:8
RUN \
  curl -L -o sbt-1.3.4.deb http://dl.bintray.com/sbt/debian/sbt-1.3.4.deb && \
  dpkg -i sbt-1.3.4.deb && \
  rm sbt-1.3.4.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion

WORKDIR /yoWorld
ADD . /yoWorld
EXPOSE 8080
CMD sbt run

