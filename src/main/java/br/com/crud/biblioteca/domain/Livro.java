package br.com.crud.biblioteca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livro")
public class Livro implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_livro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "qt_paginas")
	private Integer qtPaginas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_autor")
	private Autor autor;
}
