package com.kaique.appestabelecimento;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kaique.appestabelecimento.model.Categoria;
import com.kaique.appestabelecimento.model.Produto;
import com.kaique.appestabelecimento.repositorys.CategoriaRepository;
import com.kaique.appestabelecimento.repositorys.ProdutoRepository;

@SpringBootApplication
public class AppEstabelecimentoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AppEstabelecimentoApplication.class, args);
	}
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		
		Categoria categoria1 = new Categoria(null, "Cereal");
		Categoria categoria2 = new Categoria(null, "Bebida");
		
		Produto produto1 = new Produto(null, "Coca-Cola", BigDecimal.valueOf(5.50), categoria2);
		Produto produto2 = new Produto(null, "Fanta", BigDecimal.valueOf(5.00), categoria2);
		Produto produto3 = new Produto(null, "Arroz Urbano", BigDecimal.valueOf(3.50), categoria1);
		
		categoria1.getProdutos().addAll(Arrays.asList(produto3));
		categoria2.getProdutos().addAll(Arrays.asList(produto1, produto2));
		
		this.categoriaRepository.save(Arrays.asList(categoria1, categoria2));
		this.produtoRepository.save(Arrays.asList(produto1, produto2, produto3));
		
	}	
}
