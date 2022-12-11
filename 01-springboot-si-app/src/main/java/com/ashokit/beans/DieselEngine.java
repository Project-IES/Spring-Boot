package com.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");		
	}
	
	@Override
	public int start() {
		System.out.println("DieselEngine.start()");
		return 0;
	}

}
