package com.auyanik.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.auyanik.data")
@PropertySource("classpath:application.properties")
public class DaoConfig {

    @Resource
    Environment env;

    @Bean
    public DataSource dataSource(){

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();
        return new LocalContainerEntityManagerFactoryBean();
    }
}
