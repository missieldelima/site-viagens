package br.com.recodeviagens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringrecodeViagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrecodeViagensApplication.class, args);
		
		System.out.println("Aplicação rodando...");
		
	}

}
