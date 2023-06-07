build:
	clear
	mvn clean package -Dmaven.test.skip=true

run:
	clear
	mvn clean install -Dmaven.test.skip=true spring-boot:run

test:
	clear
	mvn clean test

run-ui:
	clear
	npm start --prefix frontend