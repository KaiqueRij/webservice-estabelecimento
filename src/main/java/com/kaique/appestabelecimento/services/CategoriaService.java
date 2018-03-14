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
		List<Categoria> list = this.categoriaRepository.findAll();
		return list;
	}
	
	public Categoria findById(Integer id){
		Categoria obj = this.categoriaRepository.findOne(id);
		
		if(obj == null)
			throw new ObjectNotFoundException("Objeto não encontrado");
		
		return obj;
	}

}
