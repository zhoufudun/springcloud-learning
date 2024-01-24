package com.macro.cloud;

import com.macro.cloud.annotation.AutoInject;
import com.macro.cloud.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosRibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRibbonServiceApplication.class, args);
    }

    @Bean
    @AutoInject
    public User user(){
        return new User(1L,"zzz","fff");
    }
}
