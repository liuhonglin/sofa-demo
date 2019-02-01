package com.lhl.test.sofa.consumer;

import com.lhl.test.sofa.services.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description
 * @Author liuhonglin
 * @Date 2019/1/31 18:56
 */
//改用注解方式 @ImportResource({"classpath*:sofa-boot-consumer.xml"})
@SpringBootApplication
public class SofaConsumerApplication {

    public static void main(String[] args) {

//        SpringApplication springApplication = new SpringApplication(SofaConsumerApplication.class);
//        ApplicationContext applicationContext = springApplication.run(args);
//
//        HelloSyncService helloSyncService = (HelloSyncService) applicationContext.getBean("helloSyncService");
//
//        System.out.println("RPC invoke result: " + helloSyncService.saySync("World!"));

        SpringApplication.run(SofaConsumerApplication.class, args);
    }

}
