package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
	
	private IEngine engine;
	
	public Car(){
		System.out.println("Car.Car()");
	}
	
	//@Autowired(required = false)
	@Autowired
	public void setEngine(IEngine engine) {
		System.out.println("Car.setEngine()");
		this.engine = engine;
	}


	public void drive() {
		int status=engine.start();
		if(status==0) {
		System.out.println("Car.drive()");
		}
	}
}
