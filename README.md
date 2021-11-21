# helloworld

testing, deploy to jenkins adn aws ecr

get jenkins image from docker<br />
docker pull jenkins/jenkins:latest-jdk11

run it
docker run -p 8080:8080 -p 50000:50000 jenkins/jenkins:latest-jdk11
