package com.apirest.rest.service;

import java.util.List;

public interface GenericService<Entity,Pk> {
	
    /**
     * findAll retorna todos os registros desta entidade
     * @return List<Entity> Resultados encontrados
     */
	List<Entity> findAll();
	
    /**
     * findById retorna uma entidade por id
     * @param Pk id sendo o id da entidade
     * @return Entity Resultado encontrado
     */
	Entity findById(Pk id);
	
    /**
     * save salva um entidade
     * @param Entity entidade que será salva
     * @return Entity entidade salva
     */
	Entity save(Entity entity);
	
    /**
     * delete deleta um entidade
     * @param Entity entidade que será deletada
     */
    void delete(Entity entity);
	
    /**
     * update atualiza um entidade
     * @param Entity entidade que será atualizada
     * @return Entity entidade atualizada
     */
    Entity update(Entity entity);
}
