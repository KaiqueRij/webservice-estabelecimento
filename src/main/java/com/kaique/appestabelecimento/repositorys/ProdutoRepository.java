package com.kaique.appestabelecimento.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.appestabelecimento.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
