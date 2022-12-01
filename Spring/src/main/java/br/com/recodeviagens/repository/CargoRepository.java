package br.com.recodeviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recodeviagens.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
