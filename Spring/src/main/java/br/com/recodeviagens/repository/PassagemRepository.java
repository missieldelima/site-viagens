package br.com.recodeviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recodeviagens.model.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {

	
	
}
