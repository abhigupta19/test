package com.javatechie.spring.heroku.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface datas {
	
	List<poji> list= new ArrayList<poji>(Arrays.asList(new poji("nama","jfja"),new poji("kaka","lama")));
	
	
	
	

}
