package br.unigranrio.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unigranrio.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
