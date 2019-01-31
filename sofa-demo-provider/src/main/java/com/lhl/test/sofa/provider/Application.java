package com.lhl.test.sofa.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/1/31 18:52
 */
@ImportResource({"classpath*:sofa-boot-provider.xml"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
