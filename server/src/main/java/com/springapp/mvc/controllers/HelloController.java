package com.springapp.mvc.controllers;

import com.springapp.mvc.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
	}

	@RequestMapping(value = "/2/{name}/{age}",method = RequestMethod.GET)
	public String getName(ModelMap model, @PathVariable("name") String name, @PathVariable("age") int age) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "name";
	}




}