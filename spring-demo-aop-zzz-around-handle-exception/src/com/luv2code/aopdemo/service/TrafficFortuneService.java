package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Expect heavy payment for mya JAVA WORKS";
		
	}

	public String getFortune(boolean tripWire) {
		
		if (tripWire) {
			throw new RuntimeException("Major lazer! Highway is OFF!");
			
		}
		return getFortune();
	}
	
	
	
}
