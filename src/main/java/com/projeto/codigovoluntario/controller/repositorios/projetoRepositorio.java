package com.projeto.codigovoluntario.controller.repositorios;


import com.projeto.codigovoluntario.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface projetoRepositorio extends JpaRepository<Projeto, Long> {
}
