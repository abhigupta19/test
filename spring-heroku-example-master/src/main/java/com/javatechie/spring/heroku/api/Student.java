package com.javatechie.spring.heroku.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	repoo repo;
	@GetMapping("/")
	public String sayHi() {
		return "Welcome to Heroku Cloud solution";
	}

	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input) {
		return "Welcome ";
	}
	@GetMapping("/kaka")
	public ArrayList<poji> datae()
	{
		
		return (ArrayList<poji>) repo.findAll();
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/kk")
	public void dataej(@RequestBody poji poji)
	{
		
		repo.save(poji);		
	}
   
}
