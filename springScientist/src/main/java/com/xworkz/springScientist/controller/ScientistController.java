package com.xworkz.springScientist.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springScientist.dto.ScientistDTO;

@Component
@RequestMapping("/")
public class ScientistController {
	public ScientistController() {
		System.out.println("Created ScientistController");
	}

	@PostMapping("/isro")
	public String learn(@Valid ScientistDTO dto,BindingResult errors,Model model) {
		System.out.println("Invoking learn().....");
		System.out.println("ScientistDTO:"+dto);
		model.addAttribute("msg", "Scientist details sent successfully");
		System.out.println("Is ScientistDTO is valid :"+errors.hasErrors());

		model.addAttribute("dto",dto);
		List<ObjectError>  objectErrors=errors.getAllErrors();
		objectErrors.forEach(e->System.err.println(e.getObjectName()+ ":message " +e.getDefaultMessage()));
		model.addAttribute("errors",objectErrors);
		return "scientist";
	}
}
