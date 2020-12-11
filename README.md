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