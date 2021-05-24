# restServer

This need openJDK 13.

## Build
    copy the restServer.jks into your home

    ./gradlew clean build
    or

    ./gradlew clean bootRun

## run tests
    cd testdata
    ### run without security

    ./run.sh

    ### run with security

    ./runSecure.sh

## OpenAPI si available at

http://localhost:8080/swagger-ui.html

or

https://localhost:8081/swagger-ui.html

## Dockerfile is available into the docker directory

This can be retrieved using pull gdimitriu/restserver:latest