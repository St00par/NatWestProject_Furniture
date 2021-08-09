package com.natwest.homedecor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UtilityController {
	
	@GetMapping("/home")
	public String home() {
		return "Homepage/Home.html";
	}
	
	@GetMapping("/new")
	public String create() {
		return "Create/Create.html";
	}
	
	@GetMapping("/del")
	public String delete() {
		return "Delete/Delete.html";
	}
	
	@GetMapping("/upd")
	public String update() {
		return "Update/Update.html";
	}
	
	@GetMapping("/see")
	public String read() {
		return "Read/Read.html";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test.html";
	}
}
