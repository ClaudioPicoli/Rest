package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entify.Pedido;

public interface PedidoService {
	
    /**
     * findAll retorna todos os registros de um Pedido
     * @return List<G> Resultados encontrados
     */
	List<Pedido> findAll();
	
    /**
     * findById retorna um registro por id do Pedido
     * @param long id sendo o id do pedido
     * @return Pedido Resultado encontrado
     */
	Pedido findById(long id);
	
    /**
     * save salva um Pedido
     * @param Pedido pedido que será salvo
     * @return Pedido pedido salvo
     */
	Pedido save(Pedido pedido);
	
    /**
     * delete deleta dados
     * @param Pedido pedido que será deletado
     */
    void delete(Pedido pedido);
	
    /**
     * update atualiza uma Pedido
     * @param Pedido pedido que será atualizado
     * @return Pedido pedido atualizada
     */
    Pedido update(Pedido pedido);
}
