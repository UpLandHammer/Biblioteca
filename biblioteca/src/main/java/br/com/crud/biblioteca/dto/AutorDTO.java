package br.com.crud.biblioteca.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
}
