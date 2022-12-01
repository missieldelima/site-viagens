package br.com.recodeviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recodeviagens.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
