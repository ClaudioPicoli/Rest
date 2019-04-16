package com.apirest.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.Cliente;
import com.apirest.rest.repository.ClienteRepository;
import com.apirest.rest.service.ClienteService;
import com.apirest.rest.utils.CpfUtils;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	public Cliente findById(long id){
		return clienteRepository.findById(id).orElse(null);
	}
	
	@Override
	public Cliente save(Cliente cliente) {
		cliente = retiraMascara(cliente);
		return clienteRepository.save(cliente);
	}
	
	public void delete(Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	@Override
	public Cliente update(Cliente cliente) {
		cliente = retiraMascara(cliente);
		return clienteRepository.save(cliente);
	}
	
	private Cliente retiraMascara(Cliente cliente) {
		if (cliente != null && cliente.getCpf() != null)
			cliente.setCpf(CpfUtils.retiraMascara(cliente.getCpf()));
		return cliente;
	}

}
