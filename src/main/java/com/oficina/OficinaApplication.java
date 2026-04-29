package com.oficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class OficinaApplication {

    public static void main(String[] args) {
        // Isso aqui inicia o servidor, o Tomcat e o Banco H2
        SpringApplication.run(OficinaApplication.class, args);
        System.out.println("O motor da oficina está roncando na porta 8080!");
    }
}