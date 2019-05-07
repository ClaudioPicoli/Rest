package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entify.Produto;

public interface ProdutoService {
	
    /**
     * findAll retorna todos os produtos
     * @return List<G> Resultados encontrados
     */
	List<Produto> findAll();
	
    /**
     * findById retorna um produto por id 
     * @param long id sendo o id do produto
     * @return Produto Resultado encontrado
     */
	Produto findById(long id);
	
    /**
     * save salva um produto
     * @param Produto produto que será salvo
     * @return Produto produto salvo
     */
	Produto save(Produto entity);
	
    /**
     * delete deleta um produto
     * @param Produto produto que será deletado
     */
    void delete(Produto entity);
	
    /**
     * update atualiza um produto
     * @param Produto produto que será atualizado
     * @return Produto produto atualizado
     */
    Produto update(Produto entity);
}
