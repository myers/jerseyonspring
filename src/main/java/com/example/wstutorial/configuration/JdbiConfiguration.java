package com.example.wstutorial.configuration;

import java.util.Set;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.argument.ArgumentFactory;
import org.jdbi.v3.core.mapper.ColumnMapper;
import org.jdbi.v3.core.mapper.ColumnMapperFactory;
import org.jdbi.v3.core.result.ResultProducers;
import org.jdbi.v3.core.transaction.SerializableTransactionRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;

@Configuration
public class JdbiConfiguration {
    private final Jdbi jdbi;

    @Inject
    public JdbiConfiguration(
            DataSource dataSource,
            Set<ArgumentFactory> arguments,
            Set<ColumnMapper> mappers,
            Set<ColumnMapperFactory> mapperFactories) {
        jdbi = Jdbi.create(dataSource);

        // jdbi.installPlugin(new SqlObjectPlugin());
        // etc

        jdbi.getConfig(ResultProducers.class).allowNoResults(true);
        jdbi.setTransactionHandler(new SerializableTransactionRunner());
        // etc

        arguments.forEach(jdbi::registerArgument);
        mapperFactories.forEach(jdbi::registerColumnMapper);
        mappers.forEach(jdbi::registerColumnMapper);
    }

    @Bean
    public Jdbi jdbi() {
        return jdbi;
    }
}