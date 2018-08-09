package br.unigranrio.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unigranrio.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
