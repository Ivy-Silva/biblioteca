package com.biblioteca.biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "emprestimo")
public class Empréstimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_emprestimo;
	
	@NotNull
	private int qtd_emprestados;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date data_retirada = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	private Date data_devolucao;
	
	
	public long getId_emprestimo() {
		return id_emprestimo;
	}
	public void setId_emprestimo(long id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}
	public int getQtd_emprestados() {
		return qtd_emprestados;
	}
	public void setQtd_emprestados(int qtd_emprestados) {
		this.qtd_emprestados = qtd_emprestados;
	}
	public Date getData_retirada() {
		return data_retirada;
	}
	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}
	public Date getData_devolucao() {
		return data_devolucao;
	}
	public void setData_devolucao(Date data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	
}
