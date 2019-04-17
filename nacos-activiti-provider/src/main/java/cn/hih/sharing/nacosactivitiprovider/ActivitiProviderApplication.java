package cn.hih.sharing.nacosactivitiprovider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author Mr. Huang
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ActivitiProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiProviderApplication.class, args);
    }

    @Bean
    public DataSource database() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://172.16.2.17:3306/activiti?characterEncoding=UTF-8")
                .username("root")
                .password("admin1234")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
}
