package com.apirest.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.apirest.rest.service.GenericService;

@Service
public abstract class GenericServiceImpl<Entity,Pk>  implements GenericService<Entity,Pk> {
	
   @Autowired
   private JpaRepository<Entity, Pk> jpaRepository;
 
    public GenericServiceImpl() {
    }

    @Override
	public List<Entity> findAll(){
		return jpaRepository.findAll();
	}
	
    @Override
	public Entity findById(Pk id){
		return jpaRepository.findById(id).orElse(null);
	}
	
    @Override
	public Entity save(Entity cliente) {
		return jpaRepository.save(cliente);
	}
	
    @Override
	public void delete(Entity cliente) {
    	jpaRepository.delete(cliente);
	}
	
    @Override
	public Entity update(Entity cliente) {
		return jpaRepository.save(cliente);
	}

}
