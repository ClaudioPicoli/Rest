package com.apirest.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.rest.entify.Produto;
import com.apirest.rest.repository.ProdutoRepository;
import com.apirest.rest.service.ProdutoService;
import com.apirest.rest.utils.MoedaUtil;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public Produto findById(long id){
		return produtoRepository.findById(id).orElse(null);
	}
	
	public Produto save(Produto produto) {
		produto = normalizaMoedas(produto);
		return produtoRepository.save(produto);
	}
	
	public void delete(Produto produto) {
		produtoRepository.delete(produto);
	}
	
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
