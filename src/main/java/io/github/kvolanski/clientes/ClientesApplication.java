package io.github.kvolanski.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.kvolanski.clientes.model.entity.Cliente;
import io.github.kvolanski.clientes.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Bean
	public CommandLineRunner run() {
		return args ->{
			Cliente cliente = Cliente.builder().cpf("00000000000").nome("Kevin").build();
			clienteRepository.save(cliente);
		};
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
