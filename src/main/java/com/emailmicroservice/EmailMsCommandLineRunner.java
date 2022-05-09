package com.emailmicroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailMsCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.println();
		System.out.println("######");
		System.out.println("Envio de emails - Microservice");
		System.out.println("Executando a classe CommandLineRunnerTest");
		System.out.println("A interface CommandLineRunner tem um comportamento semelhante ao main, ou seja, é executada juntamente com a aplicação");
		System.out.println("######");
		System.out.println();
		System.out.println();
	}
	
}