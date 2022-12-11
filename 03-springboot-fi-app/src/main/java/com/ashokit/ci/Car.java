package com.ashokit.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private IEngine engine;
	
	public void drive() {
		int status=engine.start();
		//System.out.println(status);
		if(status==1) {
			System.out.println("Journey started");
		}
		else
			System.out.println("Car starts failed)");
	}
}
