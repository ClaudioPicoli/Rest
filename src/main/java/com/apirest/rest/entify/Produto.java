package com.apirest.rest.entify;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Entidade Produto serializada
 */
@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1l;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome não pode ser nulo ou vazio")
	@Column(name = "NOME", length = 100)
	private String nome;

	@NotNull(message = "Preço é obrigatorio")
	@Column(name = "PRECO_SUGERIDO", precision = 10, scale = 2)
	private float precoSugerido;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
