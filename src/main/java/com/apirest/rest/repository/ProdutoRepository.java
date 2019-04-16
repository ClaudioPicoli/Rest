package com.apirest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.rest.entify.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
