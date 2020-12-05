package com.projeto.codigovoluntario.service;

import com.projeto.codigovoluntario.controller.repositorios.projetoRepositorio;
import com.projeto.codigovoluntario.model.Projetos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class projetosService {

    @Autowired
    private projetoRepositorio projectRepository;

    public List<Projetos> getProjects(){

        return this.projectRepository.findAll();
    }
}
