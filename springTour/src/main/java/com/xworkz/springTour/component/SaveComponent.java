package com.xworkz.springTour.component;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SaveComponent {

	public SaveComponent() {
		System.out.println("Created SaveComponent");

	}

	public ArrayList<Integer> numberGenerator() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		return list;
	}
	@GetMapping("/barber")
	public String generate (Model model) {
		model.addAttribute("number",numberGenerator());
		model.addAttribute("msg", "Saved successfully");
		return "saloon.jsp";
	}

	@PostMapping("/barber")
	public String saveComponent( @RequestParam String name, @RequestParam String purpose) {
		System.out.println("Invoking save");
		System.out.println("Name:" + name);
		System.out.println("Purpose:" + purpose);

		System.out.println("Saloon appointment saved successfully");
		return "saloon.jsp";
	}
}
