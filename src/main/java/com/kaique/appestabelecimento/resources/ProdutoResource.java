package com.kaique.appestabelecimento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.appestabelecimento.model.Produto;
import com.kaique.appestabelecimento.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		List<Produto> produtos = this.produtoService.findAll();
		return ResponseEntity.ok(produtos);
	}

}
