package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RutasDaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RutasDaikichiApplication.class, args);
	}
	
	@RequestMapping(value = "/daikichi", method= RequestMethod.GET)
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping(value = "/daikichi/today", method = RequestMethod.GET)
	public String today () {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping ( value = "/daikichi/tomorrow", method = RequestMethod.GET)
	public String tomorow() {
		return "Tomorrow, an oportunity will arise, so be sure to be open to new ideas!";
	}
	
}
