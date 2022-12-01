package br.com.recodeviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recodeviagens.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
