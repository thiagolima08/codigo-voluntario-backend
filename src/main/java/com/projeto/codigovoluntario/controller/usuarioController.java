package com.projeto.codigovoluntario.controller;


import com.projeto.codigovoluntario.model.Usuario;
import com.projeto.codigovoluntario.service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class usuarioController {

    @Autowired
    private usuarioService usuarioservice;

    @GetMapping("/user")
    public List<Usuario> getUser(){
        return this.usuarioservice.getUser();
    }

    @GetMapping("/user/{id}")
    public Usuario getUserPorId(@PathVariable("id") Long id){
        return this.usuarioservice.getUsuarioPorId(id);
    }

    @PostMapping("/user")
    public Usuario insertUser(@RequestBody Usuario usuario){
        return this.usuarioservice.insertUser(usuario);
    }

    @PutMapping("/user/{id}")
    public Usuario updateUser(@PathVariable("id") Long id, @RequestBody Usuario usuario){
        return this.usuarioservice.updateUser(id, usuario);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        this.usuarioservice.deleteUser(id);
    }

}
