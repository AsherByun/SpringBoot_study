package com.study.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {
	
	@GetMapping(path = "/signUp")
	public String signUpPage() {
		return "home";
	}
}
