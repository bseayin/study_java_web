package com.xsz.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;

public class MessageMigrationJobConfiguration {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Bean
    public BatchProperties.Job messageMigrationJob(@Qualifier("messageMigrationStep") Step messageMigrationStep) {

        return jobBuilderFactory.get("messageMigrationJob")

.start(messageMigrationStep)

.build();

    }

}
