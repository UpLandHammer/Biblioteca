package br.com.crud.biblioteca.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.biblioteca.converter.AutorConverter;
import br.com.crud.biblioteca.domain.Autor;
import br.com.crud.biblioteca.dto.AutorDTO;
import br.com.crud.biblioteca.repositories.AutorRepository;

@Service
public class AutorBusiness {

	@Autowired
	private AutorRepository autorRepository;

	@Autowired
	private AutorConverter autorConverter; 

	public AutorDTO findById(Integer idAutor) {
		Autor autor = autorRepository.findAutorById(idAutor);
		AutorDTO autorDto = autorConverter.convertToDto(autor);
		return autorDto;
	}

	public AutorDTO save(AutorDTO dto) {
		Autor model = autorConverter.convertToModel(dto);
		return autorConverter.convertToDto(autorRepository.save(model));
	}

	public List<AutorDTO> findAll() {
		return autorConverter.convertToDto(autorRepository.findAll());
	}
}
