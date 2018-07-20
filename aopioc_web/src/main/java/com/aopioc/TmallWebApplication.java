package com.aopioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName TmallWebApplication
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/20 9:54
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TmallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallWebApplication.class, args);
    }
}
