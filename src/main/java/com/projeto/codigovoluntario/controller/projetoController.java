package com.projeto.codigovoluntario.controller;

import com.projeto.codigovoluntario.model.Projetos;
import com.projeto.codigovoluntario.service.projetosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class projetoController {

    @Autowired
    private projetosService projectservice;

    @GetMapping("/listarprojetos")
    public List<Projetos> getProject(){

        return this.projectservice.getProjects();
    }


}
