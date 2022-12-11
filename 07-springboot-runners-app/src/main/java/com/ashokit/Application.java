package com.ashokit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements ApplicationRunner, CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("startClass: CommandLineRunner.run()");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("StartClass: ApplicationRunner.run()");
	}
	
	@Bean
	ApplicationRunner appRunner() {
		return args -> System.out.println("Lamda::startClass: appRunner()");
	}
	@Bean
	CommandLineRunner cmdLineRunner() {
		return args -> System.out.println("Lamda::startClass: cmdLineRunner()");
	}
}
