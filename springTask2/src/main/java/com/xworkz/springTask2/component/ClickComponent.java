package com.xworkz.springTask2.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickComponent {

	public ClickComponent() {
		System.out.println("Created ClickComponent");

	}

@PostMapping("/click")
	public String onClick() {
		System.out.println("Invoking onClick");
		return "index.jsp";
	}
}
