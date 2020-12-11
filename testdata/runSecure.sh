#!/bin/bash

curl -H "Content-Type:multipart/form-data" -F key=a1 -F actor=a2 -F data=@./test.dat https://localhost:8081/forms/form1 --cacert restServer.pem
