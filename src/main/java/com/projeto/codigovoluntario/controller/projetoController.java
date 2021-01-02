package com.projeto.codigovoluntario.controller;

import com.projeto.codigovoluntario.model.Projeto;
import com.projeto.codigovoluntario.service.projetosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class projetoController {

    @Autowired
    private projetosService projectservice;

    @GetMapping("/projects")
    public List<Projeto> getProject(){
        return this.projectservice.getProjects();
    }

    @GetMapping("/projects/{id}")
    public Projeto getProjectPorId(@PathVariable("id") Long id){
        return this.projectservice.getProjectPorId(id);
    }

    @PostMapping("/projects")
    public Projeto insertProject(@RequestBody Projeto projeto){
        return this.projectservice.insertProject(projeto);
    }

    @PutMapping("/projects/{id}")
    public Projeto updateProject(@PathVariable("id") Long id, @RequestBody Projeto projeto){
        return this.projectservice.updateProject(id, projeto);
    }

    @DeleteMapping("/projects/{id}")
    public void deleteProject(@PathVariable("id") Long id){
        this.projectservice.deleteProject(id);
    }
}
