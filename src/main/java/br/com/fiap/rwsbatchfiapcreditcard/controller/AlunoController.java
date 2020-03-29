package br.com.fiap.rwsbatchfiapcreditcard.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.rwsbatchfiapcreditcard.dto.AlunoDTO;
import br.com.fiap.rwsbatchfiapcreditcard.service.AlunoService;

@RestController
@RequestMapping("alunos")
public class AlunoController {

	private final AlunoService service;

	public AlunoController(AlunoService service) {
		this.service = service;
	}

	@GetMapping
	public List<AlunoDTO> getAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public AlunoDTO findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AlunoDTO create(@RequestBody AlunoDTO alunoDTO) {
		return service.create(alunoDTO);
	}

	@PutMapping("{id}")
	public AlunoDTO update(@PathVariable Integer id, @RequestBody AlunoDTO alunoDTO) {
		return service.update(id, alunoDTO);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
