package com.tajbanana.recordsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.tajbanana.recordsservice.repositories" )
@EntityScan(basePackages = "com.tajbanana.recordsservice.model")
public class RecordsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecordsServiceApplication.class, args);
    }

}
