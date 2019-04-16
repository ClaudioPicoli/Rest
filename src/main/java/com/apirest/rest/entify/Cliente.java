package com.apirest.rest.entify;

import java.io.Serializable;
import java.sql.Date;
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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entidade Cliente serializada
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1;
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Nome não pode ser nulo ou vazio")
    @Column(name = "NOME", length = 100)
    private String nome;

    @NotBlank(message="Cpf não pode ser nulo ou vazio")
    @Size(max = 11)
    @Column(name = "CPF", length = 11)
    //Não aplicarei validação de CPF visto que dificulta testes
    private String cpf;
	
    @NotNull(message="Data de Nascimento é obrigatoria")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
	private List<Pedido> pedidos;

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
	 * @return retorna cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param seta cpf 
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return retorna dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param seta dataNascimento
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return retorna pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * @param seta pedidos
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
  
    
}
