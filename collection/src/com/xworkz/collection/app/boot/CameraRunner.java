package com.xworkz.collection.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.app.dto.CameraDTO;

public class CameraRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in CameraRunner...");
		CameraDTO canon = new CameraDTO(1, "Canon", "M50 mark II", 43000.00, LocalDate.of(2023, 5, 1));
		CameraDTO panasonic = new CameraDTO(2, "Panasonic", "G4 S20", 35000.00, LocalDate.of(2023, 9, 10));
		CameraDTO kodak = new CameraDTO(3, "Kodak", "K560", 38000.00, LocalDate.of(2023, 8, 2));
		CameraDTO sony = new CameraDTO(4, "Sony", "Alpha 7 IV", 24000.00, LocalDate.of(2023, 6, 22));
		CameraDTO nikon = new CameraDTO(5, "Nikon", "D850", 47000.00, LocalDate.of(2023, 12, 10));

		Collection<CameraDTO> dtos = new ArrayList<>();
		dtos.add(canon);
		dtos.add(panasonic);
		dtos.add(kodak);
		dtos.add(sony);
		dtos.add(nikon);
		
		
        dtos.stream().filter(camera -> camera.getBrand().equals("Canon")).forEach(cams->System.out.println(cams.getBrand()));
        Collection<String> models=new ArrayList<>();
        dtos.stream().filter((cost)->cost.getCost()>45000).forEach(cams1->models.add(cams1.getModel()));
        models.forEach(cams2->System.out.println(cams2));
        
     Collection<Double> models1=new ArrayList<>();
     dtos.stream().filter((cams2)->cams2.getBrand().equals("Sony")).forEach(cams2->models1.add(cams2.getCost()));;
        models1.forEach(cams2->System.out.println(cams2));
        
	}
}
