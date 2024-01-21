# Records application
This application aims to create a simplified tracking app for personnel records and the current location they are in.
There are 3 different parts to this application:
- Frontend: React Typescript
- Backend: Spring Java
- Database: MySQL

in order to run `docker compose` successfully, you must first do the following
1. go into the RecordsService (backend) and run `mvn clean install -DskipTests`. This is the create the .jar file for the backend application.
2. go into the location of `docker-compose.yml` and run `docker compose build` and `docker compose up -d`

Then this will spin up the backend and db for now.
Frontend is work in progress.