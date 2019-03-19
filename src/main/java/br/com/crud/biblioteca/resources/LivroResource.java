package br.com.crud.biblioteca.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.biblioteca.business.LivroBusiness;
import br.com.crud.biblioteca.dto.LivroDTO;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

	@Autowired
	private LivroBusiness livroBusiness;

	@PostMapping
	public ResponseEntity<LivroDTO> save(@RequestBody LivroDTO dto){
		LivroDTO livro = livroBusiness.save(dto);
		return ResponseEntity.ok().body(livro);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<LivroDTO> findLivroById(@PathVariable Integer id){
		LivroDTO dto = livroBusiness.findLivroById(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping
	public ResponseEntity<List<LivroDTO>> findAll(){
		return ResponseEntity.ok().body(livroBusiness.findAll());
	}
}
