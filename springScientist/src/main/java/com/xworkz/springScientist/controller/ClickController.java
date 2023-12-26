package com.xworkz.springScientist.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickController {
	public ClickController() {
		System.out.println("Created ClickController");
	}

	@PostMapping("/info")
	public String clicks() {
		System.out.println("Invoking clicks()....");
		return "index";
	}
}
