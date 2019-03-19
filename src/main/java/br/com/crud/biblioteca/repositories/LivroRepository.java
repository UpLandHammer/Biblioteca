package br.com.crud.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.biblioteca.domain.Livro;
import br.com.crud.biblioteca.dto.LivroDTO;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

	public LivroDTO findLivroById(Integer idLivro);

	
}
