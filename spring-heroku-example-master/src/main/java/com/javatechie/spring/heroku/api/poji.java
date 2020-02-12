package com.javatechie.spring.heroku.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class poji {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String sir_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSir_name() {
		return sir_name;
	}
	public void setSir_name(String sir_name) {
		this.sir_name = sir_name;
	}
	public poji(String name, String sir_name) {
		super();
		this.name = name;
		this.sir_name = sir_name;
	}
	
    
}
