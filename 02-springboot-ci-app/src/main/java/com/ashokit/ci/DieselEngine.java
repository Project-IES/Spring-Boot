package com.ashokit.ci;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine: constructor");
	}
	@Override
	public int start() {
		System.out.println("Diesel engine starts");
		return 1;
	}

}
