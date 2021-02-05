package io.github.kvolanski.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.kvolanski.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
