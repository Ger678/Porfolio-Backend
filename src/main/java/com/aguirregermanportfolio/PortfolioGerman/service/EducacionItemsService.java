/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.service;

import com.aguirregermanportfolio.PortfolioGerman.model.EducacionItems;
import com.aguirregermanportfolio.PortfolioGerman.repository.EducacionItemsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author German
 */
public class EducacionItemsService implements IEducacionItems{
    
    @Autowired
    EducacionItemsRepository educIRepo;

    @Override
    public List<EducacionItems> getEducacionItems() {
        List<EducacionItems> items = educIRepo.findAll();
        return items;
    }

    @Override
    public void saveEducacionItems(EducacionItems educ) {
        educIRepo.save(educ);
    }

    @Override
    public void deleteEducacionItems(Long id) {
        educIRepo.deleteById( id);
    }

    @Override
    public EducacionItems findEducacionItems(Long id) {
        EducacionItems educ = educIRepo.findById(id).orElse(null);
        return educ;
    }
    
}
