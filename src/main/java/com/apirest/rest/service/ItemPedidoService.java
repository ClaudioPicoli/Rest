package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entify.ItemPedido;

public interface ItemPedidoService {
	
    /**
     * findAll retorna todos os itemPedido
     * @return List<ItemPedido> Resultados encontrados
     */
	List<ItemPedido> findAll();
	
    /**
     * findById retorna um registro por id do itemPedido
     * @param long id sendo o id da entidade
     * @return ItemPedido Resultado encontrado
     */
	ItemPedido findById(long id);
	
    /**
     * save salva um itemPedido
     * @param ItemPedido itemPedido que será salvo
     * @return ItemPedido itemPedido salvo
     */
	ItemPedido save(ItemPedido itemPedido);
	
    /**
     * delete deleta dados
     * @param ItemPedido itemPedido que será deletada
     */
    void delete(ItemPedido itemPedido);
	
    /**
     * update atualiza uma entidade
     * @param ItemPedido itemPedido que será atualizado
     * @return ItemPedido itemPedido atualizado
     */
    ItemPedido update(ItemPedido itemPedido);
}
