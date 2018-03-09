package com.kaique.appestabelecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.appestabelecimento.model.Categoria;
import com.kaique.appestabelecimento.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		List<Categoria> categorias = this.categoriaService.findAll();
		return ResponseEntity.ok(categorias);
	}

}
