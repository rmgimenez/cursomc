package com.gmail.rmgimenez.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.rmgimenez.domain.Categoria;
import com.gmail.rmgimenez.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer id) {

		Categoria categoria = categoriaRepository.findOne(id);
		return categoria;

	}

}
