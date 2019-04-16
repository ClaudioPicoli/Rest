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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Entidade Produto serializada
 */
@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Nome não pode ser nulo ou vazio")
    @Column(name = "NOME", length = 100)
    private String nome;

    @NotNull(message="Preço é obrigatorio")
    @Column(name = "PRECO_SUGERIDO", precision = 10, scale = 2)
    private float precoSugerido;
    
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
	private List<ItemPedido> itensPedidos;

	/**
	 * @return retorna Id
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
	 * @return retorna nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param seta nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return retorna precoSugerido
	 */
	public float getPrecoSugerido() {
		return precoSugerido;
	}

	/**
	 * @param seta precoSugerido
	 */
	public void setPrecoSugerido(float precoSugerido) {
		this.precoSugerido = precoSugerido;
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

