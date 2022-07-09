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
public class AcercaDeMi implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String titulo;
    private String contenido;
    private String icono;
    
    public AcercaDeMi() {
       }
    
    public AcercaDeMi(Long id, String titulo, String contenido, String icono) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.icono = icono;
    } 

    
    
}