/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author German
 */
@Getter
@Setter
@Entity
public class EducacionItems implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String fecha;
    private String logo;

    public EducacionItems() {
    }

    public EducacionItems(Long id, String titulo, String fecha, String logo) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.logo = logo;
    }
     
    
}
