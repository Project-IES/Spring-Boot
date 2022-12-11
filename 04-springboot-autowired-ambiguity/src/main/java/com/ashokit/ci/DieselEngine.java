package com.ashokit.ci;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
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
