package com.zineb.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.zineb.tp5.model.AdresseRepository;

@Controller

public class AdressController {

	@Autowired
	AdresseRepository addressRepository ;
	@GetMapping ("/adresses")
	public String showAddresses(Model model) {
	model.addAttribute("allAdresses",addressRepository.findAll());
	return "adresses";
	}
}
