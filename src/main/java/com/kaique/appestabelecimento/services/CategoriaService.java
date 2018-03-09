package com.kaique.appestabelecimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaique.appestabelecimento.model.Categoria;
import com.kaique.appestabelecimento.repositorys.CategoriaRepository;
import com.kaique.appestabelecimento.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll(){
		List<Categoria> categorias = this.categoriaRepository.findAll();
		
		if(categorias.isEmpty())
			throw new ObjectNotFoundException("Base de dados está vazia. Tipo: " + List.class.getName() + " " + Categoria.class.getName());
		
		return categorias;
	}

}
