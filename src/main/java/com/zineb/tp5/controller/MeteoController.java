package com.zineb.tp5.controller;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.zineb.tp5.model.DarkSky;
import com.zineb.tp5.model.Response;

@Controller
public class MeteoController {
	
	@PostMapping("/meteo")
	public String meteoFunction(@RequestBody String address, Model model) {
	model.addAttribute("adresse", address);
	SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
	RestTemplate restTemplate = new RestTemplate(clientHttpReq);
	Response c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address, Response.class);
	double lon = c.getFeatures().get(0).getGeometryObject().getCoordinates().get(0);
	double lat = c.getFeatures().get(0).getGeometryObject().getCoordinates().get(1);
	DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/77a4d6f96ed3dbca6d44eefba7c48238/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si",DarkSky.class);
	model.addAttribute("meteo", s);
	model.addAttribute("adresse", c.getFeatures().get(0).getPropertiesObject().getContext());
	model.addAttribute("ville", c.getFeatures().get(0).getPropertiesObject().getCity());
	return "meteo";
	
	
	}

}
