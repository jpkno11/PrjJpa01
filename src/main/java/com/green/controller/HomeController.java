package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// /hi : http://localhost:9090/hi
	@GetMapping("/hi")
	public  String   hi() {
		return "greetings";   
		  // greetings.mustache  화면을 보여줄 template 이름
		 // resources/template package 에 생성
	}
	
	@GetMapping("/hi2") 
	public  String   hi2( Model model ) {
		model.addAttribute("username", "원영이" );
		return "greetings2"; // greetings2.mustache
	}
	
	@GetMapping("/hi3") 
	public  String   hi3( Model model ) {
		model.addAttribute("username", "태훈이" );
		return "greetings3"; // greetings2.mustache
	}
	
	@GetMapping("/hi4") 
	public  String   hi4( Model model ) {
		model.addAttribute("username", "태훈이" );
		return "greetings4"; // greetings2.mustache
	}
	
	
}

