package br.com.fiap.checkpoint.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fiap.checkpoint.controller.ParenthesesValidatorController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(ParenthesesValidatorController.class, args);
    }

}