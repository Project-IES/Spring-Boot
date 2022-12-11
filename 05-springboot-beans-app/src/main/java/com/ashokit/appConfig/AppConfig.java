package com.ashokit.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ashokit.Car.Car;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	
	@Bean
	public Car customObjectByOwn() {
		System.out.println("AppConfig.customObjectByOwn()");
		Car car=new Car();
	return car;	
	}
}