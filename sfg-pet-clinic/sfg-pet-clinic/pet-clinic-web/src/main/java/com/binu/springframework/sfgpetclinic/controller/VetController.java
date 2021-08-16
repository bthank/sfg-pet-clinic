package com.binu.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {

	@RequestMapping({"","/","/list"})
	public String getVetList() {
		
		return "vets/index";
	}
	
	
}
