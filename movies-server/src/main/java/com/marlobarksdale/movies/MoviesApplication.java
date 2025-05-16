package com.marloBarksdale.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class MoviesApplication {


	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);




	}

	@GetMapping("/")
	public String apiRoot(){

		return "<h2>Hello World App</h2>";
	}

}
