package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "This is The Spring LOCAL HOST BRRRAT  " + LocalDateTime.now();
		
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
		
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day, you got the job!";
		
	}
}

