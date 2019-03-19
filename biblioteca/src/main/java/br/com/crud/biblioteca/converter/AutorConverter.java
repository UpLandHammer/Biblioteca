package br.com.crud.biblioteca.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.crud.biblioteca.domain.Autor;
import br.com.crud.biblioteca.dto.AutorDTO;

@Component
public class AutorConverter {

	public Autor convertToModel(AutorDTO dto) {
		Autor autor = new Autor(dto.getId(), dto.getNome());
		return autor;
	}

	public List<Autor> convertToModel(List<AutorDTO> dtoList) {
		ArrayList<Autor> modelList = new ArrayList<Autor>();
		for(AutorDTO dto : dtoList) {
			Autor autor = new Autor(dto.getId(), dto.getNome());
			modelList.add(autor);
		}
		return modelList;
	}

	public AutorDTO convertToDto(Autor autor) {
		AutorDTO dto = new AutorDTO(autor.getId(), autor.getNome());
		return dto;
	}

	public List<AutorDTO> convertToDto(List<Autor> modelList) {
		ArrayList<AutorDTO> dtoList = new ArrayList<AutorDTO>();
		for(Autor model : modelList) {
			AutorDTO dto = new AutorDTO(model.getId(), model.getNome());
			dtoList.add(dto);
		}
		return dtoList;
	}
}
