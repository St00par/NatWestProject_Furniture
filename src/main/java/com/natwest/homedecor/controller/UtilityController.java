package com.natwest.homedecor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UtilityController {
	
	@GetMapping("/home")
	public String home() {
		return "Home.html";
	}
	
	@GetMapping("/new")
	public String create() {
		return "Create.html";
	}
	
	@GetMapping("/del")
	public String delete() {
		return "Delete.html";
	}
	
	@GetMapping("/upd")
	public String update() {
		return "Update.html";
	}
	
	@GetMapping("/see")
	public String read() {
		return "Read.html";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test.html";
	}
}
