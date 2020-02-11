FROM websphere-liberty:springBoot2
MAINTAINER ravivp
COPY  --chown=1001:0 ./target/pring-docker-aws.jar /config/dropins/spring/spring-devops-docker.war

