package com.aguirregermanportfolio.PortfolioGerman.security.ServiceSecurity;


import com.aguirregermanportfolio.PortfolioGerman.security.Enums.RolNombre;
import com.aguirregermanportfolio.PortfolioGerman.security.ModelSecurity.Rol;
import com.aguirregermanportfolio.PortfolioGerman.security.RepositorySecurity.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre( RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
