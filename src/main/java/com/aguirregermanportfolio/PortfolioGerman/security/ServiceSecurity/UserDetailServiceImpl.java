package com.aguirregermanportfolio.PortfolioGerman.security.ServiceSecurity;

import com.aguirregermanportfolio.PortfolioGerman.security.ModelSecurity.Usuario;
import com.aguirregermanportfolio.PortfolioGerman.security.ModelSecurity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author German
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService{

    
    @Autowired
    UsuarioService usuarioService;
    
    
    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario;
        usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
}
