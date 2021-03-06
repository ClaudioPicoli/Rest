package com.apirest.rest.entify;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Entidade Item_pedido serializada
 */
@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedido implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonBackReference
	@NotNull(message = "Pedido é Obrigatorio")
	@ManyToOne
	@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID")
	private Pedido pedido;

	@NotNull(message = "Produto é Obrigatorio")
	@ManyToOne
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
	private Produto produto;

	@NotNull(message = "Quantidade é obrigatorio")
	@Column(name = "QUANTIDADE", precision = 10, scale = 2)
	private float quantidade;

	@NotNull(message = "Preço é obrigatorio")
	@Column(name = "PRECO", precision = 10, scale = 2)
	private float preco;

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
	 * @return retorna pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * @param seta pedido
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * @return retorna produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param seta produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return retorna quantidade
	 */
	public float getQuantidade() {
		return quantidade;
	}

	/**
	 * @param seta quantidade
	 */
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return retorna preco
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * @param seta preco
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}

}
