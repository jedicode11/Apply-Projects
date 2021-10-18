package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach; inside defoult constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff");
		
	}
	
	
	// define my destroy method
	@PreDestroy
	public void doMYCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
		
		
	}
	
	/*
	@Autowired
	public void PrudnyaVButilka(FortuneService theFortuneService)	{
		System.out.println(">> TennisCoach: inside PrudnyaVButilka() method");
		fortuneService = theFortuneService;
	}
		
	/*
	}
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

	
	
	
}
