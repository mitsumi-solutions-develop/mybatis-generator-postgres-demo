rm -r ./out
docker run --rm \
    -v $PWD:/local openapitools/openapi-generator-cli generate \
    -i /local/json-schemas.yaml \
    -g spring \
    --additional-properties=hideGenerationTimestamp=true,useJakartaEe=true \
    --skip-validate-spec \
    --model-package io.github.mitsumi.solutions.mybatis.postgres.generated.json.models \
    -o /local/out

if [ -d '../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/json/models/' ]; then
  rm -r ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/json/models/
fi

mkdir -p ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/json/models/

cp -r ./out/src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/json/models/*.java ../../../src/main/java/io/github/mitsumi/solutions/mybatis/postgres/generated/json/models/
