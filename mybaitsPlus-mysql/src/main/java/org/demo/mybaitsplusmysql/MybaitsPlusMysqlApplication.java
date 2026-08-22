package org.demo.mybaitsplusmysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "org.demo.mybaitsplusmysql.mapper")
public class MybaitsPlusMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsPlusMysqlApplication.class, args);
    }

}
