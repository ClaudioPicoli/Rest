package com.apirest.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.Pedido;
import com.apirest.rest.repository.PedidoRepository;
import com.apirest.rest.service.PedidoService;
import com.apirest.rest.utils.MoedaUtil;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public List<Pedido> findAll(){
		return pedidoRepository.findAll();
	}
	
	public Pedido findById(long id){
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public Pedido save(Pedido pedido) {
		pedido = normalizaMoedas(pedido);
		return pedidoRepository.save(pedido);
	}
	
	public void delete(Pedido pedido) {
		pedidoRepository.delete(pedido);
	}
	
	public Pedido update(Pedido pedido) {
		pedido = normalizaMoedas(pedido);
		return pedidoRepository.save(pedido);
	}
	
	private Pedido normalizaMoedas(Pedido pedido) {
		if (pedido != null)
			pedido.setValor(MoedaUtil.normalizaValor(pedido.getValor()));
		return pedido;
	}
}
