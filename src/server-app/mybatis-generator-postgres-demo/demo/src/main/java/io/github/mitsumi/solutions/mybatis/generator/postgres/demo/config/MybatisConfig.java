package io.github.mitsumi.solutions.mybatis.generator.postgres.demo.config;

import com.google.common.reflect.ClassPath;
import io.github.mitsumi.solutions.mybatis.postgres.extension.types.EnumTypeHandler;
import io.github.mitsumi.solutions.mybatis.postgres.extension.types.JsonTypeHandler;
import io.github.mitsumi.solutions.mybatis.postgres.extension.types.UUIDTypeHandler;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@RequiredArgsConstructor
public class MybatisConfig {

    private final MybatisCustomTypeConfig customTypeConfig;

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> {
            var registry = configuration.getTypeHandlerRegistry();

            types(customTypeConfig.getJsonModelsPackage(), Class::isEnum).forEach(clazz ->
                registry.register(clazz, JsonTypeHandler.class)
            );

            types(customTypeConfig.getEnumerationsPackage()).forEach(clazz ->
                registry.register(clazz, EnumTypeHandler.class)
            );

            registry.register(UUIDTypeHandler.class);
        };
    }

    @SafeVarargs
    @SneakyThrows
    protected final List<Class<?>> types(String packageName, Function<Class<?>, Boolean>... ignored) {
        return  ClassPath.from(ClassLoader.getSystemClassLoader())
            .getAllClasses()
            .stream()
            .filter(clazz -> clazz.getPackageName().equalsIgnoreCase(packageName))
            .map(ClassPath.ClassInfo::load)
            .filter(clazz -> {
                if (ignored != null && ignored.length > 0) {
                    return Stream.of(ignored).noneMatch(f -> f.apply(clazz));
                }

                return true;
            })
            .collect(Collectors.toList());
    }

}
