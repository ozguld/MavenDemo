package com.example.restPackage;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	@GetMapping(value="/kotu")
	public String benKotuBiriyim() {
		return "Gercekten kotu biriyim";
	}
	

}
