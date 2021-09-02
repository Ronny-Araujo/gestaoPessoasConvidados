package com.ronny.gestaopessoas.repositorio;

import com.ronny.gestaopessoas.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoasRepositorio extends JpaRepository<Pessoa, Long>{
    
}
