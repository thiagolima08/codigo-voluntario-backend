package com.projeto.codigovoluntario.controller.repositorios;

import com.projeto.codigovoluntario.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface applicationUserRepository extends JpaRepository<applicationUserRepository, Long> {
    ApplicationUser findByUsername(String username);
}
