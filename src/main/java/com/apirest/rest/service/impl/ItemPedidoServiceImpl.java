package com.apirest.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.ItemPedido;
import com.apirest.rest.repository.ItemPedidoRepository;
import com.apirest.rest.service.ItemPedidoService;
import com.apirest.rest.utils.MoedaUtil;

@Service
public class ItemPedidoServiceImpl extends GenericServiceImpl<ItemPedido, Long> implements ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	@Override
	public ItemPedido save(ItemPedido itemPedido) {
		itemPedido = normalizaMoedas(itemPedido);
		return itemPedidoRepository.save(itemPedido);
	}
	
	@Override
	public void delete(ItemPedido itemPedido) {
		itemPedidoRepository.delete(itemPedido);
	}

	private ItemPedido normalizaMoedas(ItemPedido itemPedido) {
		if (itemPedido != null)
			itemPedido.setQuantidade(MoedaUtil.normalizaValor(itemPedido.getQuantidade()));
		if (itemPedido != null)
			itemPedido.setPreco(MoedaUtil.normalizaValor(itemPedido.getPreco()));
		return itemPedido;
	}
}
