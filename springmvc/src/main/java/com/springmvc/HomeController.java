package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/test")
	public ModelAndView test() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		
		modelAndView.addObject("Name","Santosh Luitel");
		modelAndView.addObject("Roll_no",50);
		
		//adding date and time 
		
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("date", time);
		
		
		//adding list using array 
		
		List<String> friends = new ArrayList<String>();
		
		friends.add("Rojina");
		friends.add("Saurav");
		friends.add("Shrijal");
		friends.add("suman");
		friends.add("Muna");
		friends.add("Kalpana");
		
		
		modelAndView.addObject("list",friends);
		
		//setting up view jsp page
		
		modelAndView.setViewName("test");
		
		
		return modelAndView;
		
		
	}
	
}
