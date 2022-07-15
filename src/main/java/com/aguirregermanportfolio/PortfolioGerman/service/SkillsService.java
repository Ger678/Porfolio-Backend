/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.Skills;
import com.aguirregermanportfolio.PortfolioGerman.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author German
 */
@Service
public class SkillsService implements ISkillsService {

    @Autowired
    private SkillsRepository skiRepo;
    
    @Override
    public List<Skills> getSkills() {
        List<Skills> listaSki = skiRepo.findAll();
        return listaSki;
    }

    @Override
    public void saveSkills(Skills ski) {
        skiRepo.save(ski);
    }

    @Override
    public void deleteSkills(Long id) {
        skiRepo.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
        Skills hab = skiRepo.findById(id).orElse(null);
        return hab; 
    }
    
}
