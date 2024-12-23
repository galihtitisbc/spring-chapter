package org.relationship.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.relationship")
public class ProjectConfig {
//    @Bean
//    Parrot parrot() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    Person person(Parrot parrot) {
//        Person p = new Person();
//        p.setName("Woosa");
//        p.setParrot(parrot);
//        return p;
//    }
}
