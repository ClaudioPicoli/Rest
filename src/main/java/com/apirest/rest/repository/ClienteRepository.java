package com.apirest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.rest.entify.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
