package com.springmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.User.User;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return"contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		
		return"success";
	}

}
