package com.apirest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entify.Produto;
import com.apirest.rest.service.ProdutoService;

@RestController
@RequestMapping(value="/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/findAll")
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Produto findById(@PathVariable(value="id")long id){
		return produtoService.findById(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Produto produto) {
		try {
			Produto p =produtoService.save(produto);
			return new ResponseEntity<>(p,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("delete")
	public void delete(@RequestBody Produto produto) {
		produtoService.delete(produto);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Produto produto) {
		try {
			Produto p = produtoService.update(produto);
			return new ResponseEntity<>(p,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
