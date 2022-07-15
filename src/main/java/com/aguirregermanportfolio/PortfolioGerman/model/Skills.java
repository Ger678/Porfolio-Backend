/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author German
 */
@Entity
@Getter
@Setter
public class Skills implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    
    private String icono;
    private String nombre;
    private String descripcion;
    private String fotos;
    private Long porcentaje;

    public Skills() {
    }

    public Skills(Long id, String icono, String nombre, String descripcion, String fotos, Long porcentaje) {
        this.id = id;
        this.icono = icono;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotos = fotos;
        this.porcentaje = porcentaje;
    }

    
    
    
}
