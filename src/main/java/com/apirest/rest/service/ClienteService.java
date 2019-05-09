package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entify.Cliente;

public interface ClienteService {
	
    /**
     * findAll retorna todos os Clientes
     * @return List<G> Resultados encontrados
     */
	List<Cliente> findAll();
	
    /**
     * findById retorna um cliente por id
     * @param long id sendo o id do cliente
     * @return Cliente Resultado encontrado
     */
	Cliente findById(long id);
	
    /**
     * save salva um Cliente
     * @param Cliente cliente que será salvo
     * @return Cliente cliente salvo
     */
	Cliente save(Cliente cliente);
	
    /**
     * delete deleta um Cliente
     * @param Cliente cliente que será deletado
     */
    void delete(Cliente cliente);
	
    /**
     * update atualiza um cliente
     * @param Cliente cliente que será atualizado
     * @return Cliente cliente atualizadp
     */
    Cliente update(Cliente cliente);
}
