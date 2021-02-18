#!/bin/bash

rc=`curl -H "Content-Type:multipart/form-data" -F key=a1 -F actor=a2 -F data=@./test.dat https://localhost:8081/forms/form1 --cacert restServer.pem 2> /dev/null`
if [ "$rc" != "success" ]; then
  echo $rc;
fi

rc=`curl -H "Content-Type:multipart/form-data" -F key=a1 -F actor=a2 -F data=@./test.dat https://localhost:8081/forms/formSecure --cacert restServer.pem -u user:user 2> /dev/null`
if [ -z $rc ]; then
  echo "fail with no reply";
elif [ "$rc" != "success" ]; then
  echo $rc;
fi