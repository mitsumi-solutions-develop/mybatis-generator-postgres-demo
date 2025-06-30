rm -r ./out
docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli generate \
    -i /local/enumeration-schemas.yaml \
    -g spring \
    --additional-properties=hideGenerationTimestamp=true,useJakartaEe=true \
    --skip-validate-spec \
    --model-package io.github.mitsumi.solutions.mybatis.postgres.generated.enumerations \
    -o /local/out

if [ -d '../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/enumerations/' ]; then
  rm -r ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/enumerations/
fi

mkdir -p ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/enumerations/

cp -r ./out/src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/enumerations/*.java ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/enumerations/
