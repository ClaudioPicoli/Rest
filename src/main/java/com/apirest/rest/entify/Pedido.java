package com.apirest.rest.entify;

import java.io.Serializable;
import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Entidade Pedido serializada
 */
@Entity
@Table(name = "PEDIDO")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonBackReference
	@NotNull(message = "Cliente é obrigatorio")
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
	private Cliente cliente;

	@NotNull(message = "Preço sugerido é obrigatorio")
	@Column(name = "PRECO_SUGERIDO", precision = 10, scale = 2)
	private float valor;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
	private Set<ItemPedido> itensPedidos;

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
	public Set<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	/**
	 * @param seta itensPedidos
	 */
	public void setItensPedidos(Set<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Float.floatToIntBits(valor);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
			return false;
		return true;
	}

}
