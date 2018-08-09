package br.unigranrio.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unigranrio.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {
	
	public Cliente findByNome(String nome);

}
