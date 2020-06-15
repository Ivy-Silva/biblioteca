package com.biblioteca.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	private long isbn;
	
	@NotNull
	private String titulo_livro;
	
	@NotNull
	private String autor_livro;
	
	@NotNull
	private int qtd_exemplares;
	
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo_livro() {
		return titulo_livro;
	}
	public void setTitulo_livro(String titulo_livro) {
		this.titulo_livro = titulo_livro;
	}
	public String getAutor_livro() {
		return autor_livro;
	}
	public void setAutor_livro(String autor_livro) {
		this.autor_livro = autor_livro;
	}
	public int getQtd_exemplares() {
		return qtd_exemplares;
	}
	public void setQtd_exemplares(int qtd_exemplares) {
		this.qtd_exemplares = qtd_exemplares;
	}
	
	
}
