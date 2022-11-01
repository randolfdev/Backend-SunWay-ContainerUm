package com.orquestrador.containerUm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerUmApplication {

	@RequestMapping("/")
	public String home() {
		return "Conectado ao ContainerUm";
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainerUmApplication.class, args);
	}
	
}
