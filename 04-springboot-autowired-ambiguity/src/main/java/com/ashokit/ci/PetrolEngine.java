package com.ashokit.ci;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dc")

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine: constructor");
	}
	@Override
	public int start() {
		System.out.println("Petrol engine starts");
		return 1;
	}

}
