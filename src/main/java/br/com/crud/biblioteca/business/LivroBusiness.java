package br.com.crud.biblioteca.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.biblioteca.converter.LivroConverter;
import br.com.crud.biblioteca.domain.Livro;
import br.com.crud.biblioteca.dto.LivroDTO;
import br.com.crud.biblioteca.repositories.LivroRepository;

@Service
public class LivroBusiness {

	@Autowired
	private LivroRepository livroRepository;

	@Autowired
	private LivroConverter livroConverter;

	public LivroDTO save(LivroDTO livroDTO) {
		Livro livro = livroRepository.save(livroConverter.convertToModel(livroDTO));
		return livroConverter.convertToDto(livro);
	}

	public LivroDTO findLivroById(Integer idLivro) {
		return livroRepository.findLivroById(idLivro);
	}

	public List<LivroDTO> findAll(){
		return livroConverter.convertToDto(livroRepository.findAll());
	}
}
