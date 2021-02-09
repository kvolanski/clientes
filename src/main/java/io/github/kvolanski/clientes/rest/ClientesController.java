package io.github.kvolanski.clientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.kvolanski.clientes.model.entity.Cliente;
import io.github.kvolanski.clientes.model.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}
	
}
