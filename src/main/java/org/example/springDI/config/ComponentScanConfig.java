package org.example.springDI.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("org.example.springDI") //var den ska leta
@Configuration
public class ComponentScanConfig {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }


}