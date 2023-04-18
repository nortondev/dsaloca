package br.gov.sp.etec.alocacao.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.alocacao.model.Carro;
import br.gov.sp.etec.alocacao.repository.CarroRepository;

@RestController
public class CarroController {

	@Autowired // fazendo a ligação entre a controller e a repository
	CarroRepository repository;
	@GetMapping("/carros") //get - pegando informação
	public List<Carro> carros() {
		
		return repository.findAll();
	}

	@PostMapping("adicionar-carro")
	public Carro addCarro(@RequestBody Carro carro) {  // get = url, post = vem no body
		return repository.save(carro);
	}
	
	@PutMapping("atualizar-carro")
	public Carro updateCarro(@RequestBody Carro carro) {
		return repository.save(carro); // recuperar o body
	}
	
	@DeleteMapping("deletar-carro/{id}")
	public void deleteCarro(@PathVariable long id) {
		repository.deleteById(id);
	}


}
