FROM websphere-liberty:springBoot2
MAINTAINER ravivp
COPY  --chown=1001:0 ./target/spring-devops-docker.war /config/dropins/spring/spring-devops-docker.war

