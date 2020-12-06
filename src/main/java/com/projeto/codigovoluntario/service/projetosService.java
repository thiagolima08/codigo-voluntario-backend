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

    public Projetos getProjectPorId(Long idProject){
        return this.projectRepository.findById(idProject).orElse(null);
    }

    public Projetos insertProject(Projetos projeto){
        return this.projectRepository.save(projeto);
    }
}
