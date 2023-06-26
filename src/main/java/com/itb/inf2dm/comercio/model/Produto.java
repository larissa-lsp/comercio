package com.itb.inf2dm.comercio.model;

public class Produto {
	private Long id;
	private String descricao;
	private String nome;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	
	// public: Modificador de acesso livre para todas as classes.
	// private: Modificador de acesso restrito apenas para membros da propria classe.
	//			Entenda-se por "membros" (atributos e/ou métodos)
	
	// Métodos Setter's e Getter's: Adicionar e Recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public boolean getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	
}