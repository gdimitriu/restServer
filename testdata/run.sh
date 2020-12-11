#!/bin/bash

curl -H "Content-Type:multipart/form-data" -F key=a1 -F actor=a2 -F data=@./test.dat localhost:1080/forms/form1
