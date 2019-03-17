package br.com.crud.biblioteca.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.biblioteca.business.AutorBusiness;
import br.com.crud.biblioteca.dto.AutorDTO;

@RestController
@RequestMapping(value = "/livros")
public class AutorResource {

	@Autowired
	private AutorBusiness autorBusiness;

	@GetMapping(value = "/{id}")
	public ResponseEntity<AutorDTO> findById(@PathVariable Integer id){
		AutorDTO autor = autorBusiness.findById(id);
		return ResponseEntity.ok().body(autor);
	}

	@PostMapping
	public ResponseEntity<AutorDTO> save(@RequestBody AutorDTO dto){
		AutorDTO autorDTO = autorBusiness.save(dto);
		return ResponseEntity.ok().body(autorDTO);
	}
}
