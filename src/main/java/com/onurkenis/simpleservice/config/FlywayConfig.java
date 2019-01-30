package com.onurkenis.simpleservice.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

    @Value("${spring.datasource.url}")
    private String dataSource;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.jpa.properties.hibernate.default_schema}")
    private String schema;

    @Bean
    public FlywayMigrationInitializer flywayInitializer() {
        final Flyway flyway =
                Flyway.configure().dataSource(dataSource, userName, password).schemas(schema).load();

        flyway.migrate();

        return new FlywayMigrationInitializer(flyway);
    }


}
