package com.example.cdproject;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class CdprojectApplication {


	@RequestMapping("/")
	String home() {
		return "Welcome to Continuous delivery!";
	}


	public static void main(String[] args) {
		SpringApplication.run(CdprojectApplication.class, args);
	}

}
