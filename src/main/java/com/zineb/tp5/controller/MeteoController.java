package com.zineb.tp5.controller;

import java.beans.PropertyChangeListenerProxy;
import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.zineb.tp5.model.Address;

@Controller
public class MeteoController {

	 @PostMapping ("/meteo")
	 public String test(@RequestParam String address) {
		
		 
		 SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
		clientHttpReq.setProxy(proxy);
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Object c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=8+bd+du+port", Object.class);
		 
		
		
		 return "meteo";
	 }

}
