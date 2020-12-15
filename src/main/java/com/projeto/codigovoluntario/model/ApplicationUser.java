package com.projeto.codigovoluntario.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "USUARIO")
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public Long getId(){
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String email) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
