#!/bin/bash
curl -H "Content-Type:multipart/form-data" -F key=a1 -F actor=a2 -F data=@./test.dat localhost:1080/forms/form1

rc=`curl -G localhost:1080/entry/info 2>/dev/null`

if [ "$rc" != "MyEntryPoint" ]; then
  echo "did not succeded"
fi

rc=`curl -G localhost:1080/entry/secured -u user:user 2>/dev/null`

if [ "$rc" != "MySecuredInfo" ]; then
  echo "did not succeded"
fi