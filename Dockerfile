FROM websphere-liberty:springBoot2
MAINTAINER ravivp
COPY  --chown=1001:0 ./target/spring-docker-aws.war /config/dropins/spring/pring-docker-aws.war

