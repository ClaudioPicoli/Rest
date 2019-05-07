package com.apirest.rest.entify;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entidade Pedido serializada
 */
@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1;
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message="Cliente é obrigatorio")
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
	private Cliente cliente;
    
    @NotNull(message="Preço sugerido é obrigatorio")
    @Column(name = "PRECO_SUGERIDO", precision = 10, scale = 2)
    private float valor;
    
    @NotNull(message="O pedido deve conter Itens")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
	private List<ItemPedido> itensPedidos;

	/**
	 * @return retorna id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param seta id 
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return retorna cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param seta cliente 
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return retorna valor
	 */
	public float getValor() {
		return valor;
	}

	/**
	 * @param seta valor
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}

	/**
	 * @return retorna itensPedidos
	 */
	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	/**
	 * @param seta itensPedidos
	 */
	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
    
}
