package com.kaique.appestabelecimento.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaique.appestabelecimento.model.Produto;
import com.kaique.appestabelecimento.repositorys.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		List<Produto> produtos = this.produtoRepository.findAll();
		return produtos;
	}

}
