package com.xworkz.springTask2.component;

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
	@GetMapping("/info")
	public String generate (Model model) {
		model.addAttribute("number",numberGenerator());
		model.addAttribute("msg", "Saved successfully");
		return "contact.jsp";
	}

	@PostMapping("/info")
	public String saveComponent( @RequestParam String name,@RequestParam String email,@RequestParam String age,@RequestParam String city,@RequestParam String district,@RequestParam String state,@RequestParam String country,@RequestParam String pincode) {
		System.out.println("Invoking save");
		System.out.println("Name:" + name);
		System.out.println("Email:" + email);  
		System.out.println("Age:" + age);
		System.out.println("City:" + city);
		System.out.println("District:" + district);
		System.out.println("State:" + state);
		System.out.println("Country:" + country);
		System.out.println("Pincode:" + pincode);

		System.out.println("Contact details saved successfully");
		return "contact.jsp";
	}
}
