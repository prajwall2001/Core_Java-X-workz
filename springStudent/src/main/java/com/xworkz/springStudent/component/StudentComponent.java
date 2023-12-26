package com.xworkz.springStudent.component;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springStudent.dto.StudentDTO;

@Component
@RequestMapping("/")
public class StudentComponent {
	public StudentComponent() {
		System.out.println("Created StudentComponent");
	}

	@PostMapping("/vtu")
	public String learn(@Valid StudentDTO dto,BindingResult errors,Model model) {
		System.out.println("Invoking learn().....");
		System.out.println("StudentDTO:"+dto);
		model.addAttribute("msg", "Student details sent successfully");
		System.out.println("Is StudentDTO is valid :"+errors.hasErrors());

		model.addAttribute("dto",dto);
		List<ObjectError>  objectErrors=errors.getAllErrors();
		objectErrors.forEach(e->System.out.println(e.getObjectName()+ ":message " +e.getDefaultMessage()));
		model.addAttribute("errors",objectErrors);
		return "student";
	}
}
