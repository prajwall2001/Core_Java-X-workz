package com.xworkz.springProject.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {

	public ClickComponent() {
		System.out.println("Created ClickComponent");

	}

	@RequestMapping(value = "/click", method = RequestMethod.GET)
	public String onClick(Model model) {
		System.out.println("Invoking onClick");
		model.addAttribute("name", "Prajwal L");
		return "index.jsp";
	}
}
