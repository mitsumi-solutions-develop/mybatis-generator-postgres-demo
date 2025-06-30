package io.github.mitsumi.solutions.mybatis.generator.postgres.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mybatis.custom.type")
@Getter
@Setter
public class MybatisCustomTypeConfig {

    private String jsonModelsPackage;

    private String enumerationsPackage;
}
