all: build

up:
	@docker-compose up -d

build:
	@./gradlew build --warning-mode all

run-tests:
	@./gradlew test --warning-mode all

run:
	@./gradlew :run

build-jar:
	@./gradlew :bootJar

# Start the app
start-backoffice_backend:
	@./gradlew :run --args='backoffice_backend server'

start-backoffice_frontend:
	@./gradlew :run --args='backoffice_frontend server'

start-retention_backend:
	@./gradlew :run --args='retention_backend server domain-events:mysql:consume'
