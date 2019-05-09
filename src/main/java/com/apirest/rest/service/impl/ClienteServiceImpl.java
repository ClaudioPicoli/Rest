package com.apirest.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.Cliente;
import com.apirest.rest.repository.ClienteRepository;
import com.apirest.rest.service.ClienteService;
import com.apirest.rest.utils.CpfUtils;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente save(Cliente cliente) {
		cliente = retiraMascara(cliente);
		return clienteRepository.save(cliente);
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
