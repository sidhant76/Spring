package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Dev {
	
	@Autowired //field injection
	private Laptop lap = null;
	
	public void build() {
		
		System.out.println("Working on Spring");
		lap.compile();
	}

}
