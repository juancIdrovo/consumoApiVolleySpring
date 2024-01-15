package com.insta.springboot.backend.apirest;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebJsioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebJsioApplication.class, args);
		
		Random rand = new Random();
		int numero = rand.nextInt(100);
		if (numero % 2 == 0) {
			System.out.println("Bienvenido a Spring Boot, Juanc IO");
		} else {
			System.out.println("Bienvenido a Spring Boot, Sebas IO");
		}
		
	}

}
