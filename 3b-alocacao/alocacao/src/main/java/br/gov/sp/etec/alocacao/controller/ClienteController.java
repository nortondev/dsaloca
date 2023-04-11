package br.gov.sp.etec.alocacao.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.gov.sp.etec.alocacao.model.Cliente;
import br.gov.sp.etec.alocacao.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository repository;
	@GetMapping("/clientes")
	public List<Cliente> clientes() {
		return repository.findAll();
		
	}
	
	@PostMapping("adicionar-cliente")
	public Cliente addCliente(@RequestBody Cliente cliente)
	{
		return repository.save(cliente);
	}
}
