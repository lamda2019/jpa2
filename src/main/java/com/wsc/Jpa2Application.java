package com.wsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.wsc.repository") //指定仓库的扫描路径
public class Jpa2Application {

    public static void main(String[] args) {
        SpringApplication.run(Jpa2Application.class, args);
    }

}
