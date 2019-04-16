package com.apirest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.rest.entify.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
