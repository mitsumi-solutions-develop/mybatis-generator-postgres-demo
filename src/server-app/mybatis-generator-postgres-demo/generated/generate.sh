#!/bin/bash

rm ./src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/base/mappers/*.java
rm ./src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/base/entities/*.java

# shellcheck disable=SC2164
cd ./support/open-api-code-generator/enumeration-schemas/
sh generate.sh

# shellcheck disable=SC2164
cd ../json-schemas
sh generate.sh

# shellcheck disable=SC2164
cd ../../../

mvn -X -Dline.separator=$'\n' \mybatis-generator:generate
#mvnDebug -X -Dline.separator=$'\n' \mybatis-generator:generate
