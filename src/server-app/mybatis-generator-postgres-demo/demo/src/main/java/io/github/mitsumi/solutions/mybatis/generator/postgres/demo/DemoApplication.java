package io.github.mitsumi.solutions.mybatis.generator.postgres.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.mitsumi.solutions")
@MapperScan(value = {
    "io.github.mitsumi.solutions.mybatis.postgres.generated.mappers",
})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
