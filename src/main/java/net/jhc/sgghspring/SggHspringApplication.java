package net.jhc.sgghspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("net.jhc.sgghspring.dao")
@SpringBootApplication
@EnableCaching
public class SggHspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SggHspringApplication.class, args);
    }

}
