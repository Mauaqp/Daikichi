package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
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
//	Rutas daikichi CORE - Travel
	@RequestMapping ( value = "/daikichi/travel/{place}", method = RequestMethod.GET)
	public String travelPlace(@PathVariable("place") String place) {
		return "Congratulations!, You will soon travel to " + place;
	}
//	Rutas daikichi CORE - Lotto
	@RequestMapping ( value = "/daikichi/lotto/{num}", method = RequestMethod.GET)
	public String lotto(@PathVariable("num") Integer num) {
		if ( num % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers ";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
	
}
