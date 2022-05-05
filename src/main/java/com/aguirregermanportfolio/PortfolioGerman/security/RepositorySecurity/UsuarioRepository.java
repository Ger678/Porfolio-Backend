package com.aguirregermanportfolio.PortfolioGerman.security.RepositorySecurity;


import com.aguirregermanportfolio.PortfolioGerman.security.ModelSecurity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author German
 */
@Repository
public interface UsuarioRepository extends JpaRepository < Usuario, Integer> {
    
    Optional<Usuario> findByNombreUsuario ( String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
    
}
