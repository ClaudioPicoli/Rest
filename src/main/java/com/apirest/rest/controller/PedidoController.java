package com.apirest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entify.Pedido;
import com.apirest.rest.service.PedidoService;

@RestController
@RequestMapping(value="/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/findAll")
	public List<Pedido> findAll(){
		return pedidoService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Pedido findById(@PathVariable(value="id")long id){
		return pedidoService.findById(id);
	}
	
	@PostMapping("/save")
	public Pedido save(@RequestBody Pedido pedido) {
		return pedidoService.save(pedido);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Pedido pedido) {
		pedidoService.delete(pedido);
	}
	
	@PutMapping("/update")
	public Pedido update(@RequestBody Pedido pedido) {
		return pedidoService.update(pedido);
	}
}
