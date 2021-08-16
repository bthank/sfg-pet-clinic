package com.binu.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

	@RequestMapping({"","/","list"})
	public String displayOwnerList() {
		
		return "owners/index";
		
	}
	
	
}
