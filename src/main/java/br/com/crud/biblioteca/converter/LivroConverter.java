package br.com.crud.biblioteca.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.crud.biblioteca.domain.Autor;
import br.com.crud.biblioteca.domain.Livro;
import br.com.crud.biblioteca.dto.LivroDTO;

@Component
public class LivroConverter {

	public Livro convertToModel(LivroDTO dto) {
		Livro livro = new Livro(dto.getId(), dto.getNome(), dto.getQtPaginas(), dto.getAutor());
		return livro;
	}

	public List<Livro> convertToModel(List<LivroDTO> dtoList) {
		List<Livro> modelList = new ArrayList<Livro>();
		for(LivroDTO dto : dtoList) {
			Livro livro = new Livro(dto.getId(), dto.getNome(), dto.getQtPaginas(), dto.getAutor());
			modelList.add(livro);
		}
		return modelList;
	}

	public LivroDTO convertToDto(Livro model) {
		LivroDTO dto = new LivroDTO(model.getId(), model.getNome(), model.getQtPaginas(), model.getAutor());
		return dto;
	}

	public List<LivroDTO> convertToDto(List<Livro> modelList) {
		ArrayList<LivroDTO> dtoList = new ArrayList<LivroDTO>();
		for(Livro model : modelList) {
			LivroDTO dto = new LivroDTO(model.getId(), model.getNome(), model.getQtPaginas(), model.getAutor());
			dtoList.add(dto);
		}
		return dtoList;
	}

}
