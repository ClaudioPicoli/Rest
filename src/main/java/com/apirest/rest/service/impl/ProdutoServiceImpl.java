package com.apirest.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.Produto;
import com.apirest.rest.repository.ProdutoRepository;
import com.apirest.rest.service.ProdutoService;
import com.apirest.rest.utils.MoedaUtil;

@Service
public class ProdutoServiceImpl extends GenericServiceImpl<Produto, Long> implements ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Produto save(Produto produto) {
		produto = normalizaMoedas(produto);
		return produtoRepository.save(produto);
	}

	@Override
	public Produto update(Produto produto) {
		produto = normalizaMoedas(produto);
		return produtoRepository.save(produto);
	}
	
	private Produto normalizaMoedas(Produto produto) {
		if (produto != null)
			produto.setPrecoSugerido(MoedaUtil.normalizaValor(produto.getPrecoSugerido()));
		return produto;
	}
}
