
FROM java:8
WORKDIR /
ADD /target/scala-2.13/yoworld_2.13-0.1.jar yoworld_2.13-0.1.jar
EXPOSE 8080
CMD java - jar yoworld_2.13-0.1.jar
