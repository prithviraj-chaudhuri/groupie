delete-db:
	docker-compose -f docker/database/docker-compose.yml down

run-db:
	docker-compose -f docker/database/docker-compose.yml up

build:
	mvn clean package -Dmaven.test.skip=true

run:
	mvn clean install -Dmaven.test.skip=true spring-boot:run

test:
	mvn clean test