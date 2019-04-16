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

import com.apirest.rest.entify.ItemPedido;
import com.apirest.rest.service.ItemPedidoService;

@RestController
@RequestMapping(value="/item_pedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService itemPedidoService;

	@GetMapping("/findAll")
	public List<ItemPedido> findAll(){
		return itemPedidoService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public ItemPedido findById(@PathVariable(value="id")long id){
		return itemPedidoService.findById(id);
	}
	
	@PostMapping("/save")
	public ItemPedido save(@RequestBody ItemPedido itemPedido) {
		return itemPedidoService.save(itemPedido);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody ItemPedido itemPedido) {
		itemPedidoService.delete(itemPedido);
	}
	
	@PutMapping("/update")
	public ItemPedido update(@RequestBody ItemPedido itemPedido) {
		return itemPedidoService.update(itemPedido);
	}
}
