package org.ithinking.banana.pay;

import org.ithinking.banana.comm.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Application
 *
 * @author agan
 * @date 2016-05-07
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana.pay")
@EnableAutoConfiguration
@ImportResource("classpath:META-INF/spring/dubbo-pay-provider.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
