package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.NewspaperDTO;

public interface NewspaperRepository {
	int TOTAL_PAPERS = 10;

	public void save(NewspaperDTO dto);

}
