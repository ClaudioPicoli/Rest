package com.apirest.rest.service;

import java.io.Serializable;
import java.util.List;

public interface EntityService<Entity extends Serializable, id extends Serializable> {
	
    /**
     * findAll retorna todos os registros de um tipo de entidade
     * @return List<G> Resultados encontrados
     */
	List<Entity> findAll();
	
    /**
     * findById retorna um registro por id da entidade
     * @param long id sendo o id da entidade
     * @return Entity Resultado encontrado
     */
	Entity findById(long id);
	
    /**
     * save salva uma entidade
     * @param Entity entity entidade que será salva
     * @return Entity entidade salva
     */
	Entity save(Entity entity);
	
    /**
     * delete deleta dados
     * @param Entity entity entidade que será deletada
     */
    void delete(Entity entity);
	
    /**
     * update atualiza uma entidade
     * @param Entity entity entidade que será atualizada
     * @return Entity entidade atualizada
     */
	Entity update(Entity entity);
}
