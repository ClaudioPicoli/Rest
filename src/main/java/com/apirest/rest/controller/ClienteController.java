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

import com.apirest.rest.entify.Cliente;
import com.apirest.rest.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping("/findAll")
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Cliente findById(@PathVariable(value="id")long id){
		return clienteService.findById(id);
	}
	
	@PostMapping("/save")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Cliente cliente) {
		clienteService.delete(cliente);
	}
	
	@PutMapping("/update")
	public Cliente update(@RequestBody Cliente cliente) {
		return clienteService.update(cliente);
	}
}
