package com.zzg.city;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhang
 */
@SpringBootApplication
@MapperScan("com.zzg.city.mapper")
public class CityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class, args);
    }

}
