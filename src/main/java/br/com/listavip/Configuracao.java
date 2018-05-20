package br.com.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;

@SpringBootApplication
@Controller
public class Configuracao {

    public static void main(String[] args) {
        SpringApplication.run(Configuracao.class, args);
    }

    @Bean
    public DataSource dataSource() {

        return DataSourceBuilder
                .create()
                .username("postgres")
                .password("postgres")
                .url("jdbc:postgresql://postgresdb:5432/listavip")
                .driverClassName("org.postgresql.Driver")
                .build();
    }

}
