package br.com.mecontrata.management.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.server.resource", "br.com.mecontrata.management.service"})
public class ManagementServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagementServiceApplication.class, args);
    }
}
