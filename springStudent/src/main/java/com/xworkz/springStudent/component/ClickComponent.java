package com.xworkz.springStudent.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickComponent {
	public ClickComponent() {
		System.out.println("Created ClickComponent");
	}

	@PostMapping("/info")
	public String clicks() {
		System.out.println("Invoking clicks()....");
		return "index";
	}
}
