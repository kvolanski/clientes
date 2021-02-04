package io.github.kvolanski.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.kvolanski.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
