package com.javatechie.spring.heroku.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
 class SpringHerokuExampleApplication {
	public static void main(String[] args) {
		poji poji=new poji("abhinav","gupta");
		SpringApplication.run(SpringHerokuExampleApplication.class, args);
	}
}
