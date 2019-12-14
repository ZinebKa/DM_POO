package com.zineb.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {
	 @GetMapping ("/Address")
	 public String test(Model model) {
		 return "Address";
	 }

}
