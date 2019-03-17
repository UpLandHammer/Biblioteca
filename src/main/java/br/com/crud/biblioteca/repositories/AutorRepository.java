package br.com.crud.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.biblioteca.domain.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

	public Autor findAutorById(Integer id);
}
