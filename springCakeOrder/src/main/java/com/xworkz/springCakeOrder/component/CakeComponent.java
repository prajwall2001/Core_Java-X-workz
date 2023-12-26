package com.xworkz.springCakeOrder.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.springCakeOrder.dto.CakeDTO;


@Component
@RequestMapping("/")
public class CakeComponent {
	public CakeComponent() {
		System.out.println("Invoking CakeComponent");
	}

	@PostMapping("/info")
	public String order(@Valid CakeDTO dto,BindingResult errors,Model model) {
		System.out.println("CakeComponent:"+dto);
		model.addAttribute("msg", "Order placed successfully");
		
		System.out.println("Is cake dto is valid:"+errors.hasErrors());
		
		List<ObjectError> objectErrors=errors.getAllErrors();
		objectErrors.forEach(e->System.err.println(e.getObjectName() +":meassage "+e.getDefaultMessage()));
		model.addAttribute("dto", dto);
		model.addAttribute("errors",objectErrors);
		return "cakeOrder";
		
	}
}