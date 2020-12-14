package com.projeto.codigovoluntario.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String password;

    public Usuario(String email, String password) {
    }

    public Usuario(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}