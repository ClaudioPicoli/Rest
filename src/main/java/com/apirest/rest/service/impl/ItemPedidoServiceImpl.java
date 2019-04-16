package com.apirest.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.ItemPedido;
import com.apirest.rest.repository.ItemPedidoRepository;
import com.apirest.rest.service.ItemPedidoService;
import com.apirest.rest.utils.MoedaUtil;

@Service
public class ItemPedidoServiceImpl implements ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public List<ItemPedido> findAll(){
		return itemPedidoRepository.findAll();
	}
	
	public ItemPedido findById(long id){
		return itemPedidoRepository.findById(id).orElse(null);
	}
	
	@Override
	public ItemPedido save(ItemPedido itemPedido) {
		itemPedido = normalizaMoedas(itemPedido);
		return itemPedidoRepository.save(itemPedido);
	}
	
	public void delete(ItemPedido itemPedido) {
		itemPedidoRepository.delete(itemPedido);
	}
	
	@Override
	public ItemPedido update(ItemPedido itemPedido) {
		itemPedido = normalizaMoedas(itemPedido);
		return itemPedidoRepository.save(itemPedido);
	}
	
	private ItemPedido normalizaMoedas(ItemPedido itemPedido) {
		if (itemPedido != null)
			itemPedido.setQuantidade(MoedaUtil.normalizaValor(itemPedido.getQuantidade()));
		if (itemPedido != null)
			itemPedido.setPreco(MoedaUtil.normalizaValor(itemPedido.getPreco()));
		return itemPedido;
	}
}
