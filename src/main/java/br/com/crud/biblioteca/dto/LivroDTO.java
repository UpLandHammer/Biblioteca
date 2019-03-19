package br.com.crud.biblioteca.dto;

import java.io.Serializable;

import br.com.crud.biblioteca.domain.Autor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Integer qtPaginas;
	private Autor autor;

}
