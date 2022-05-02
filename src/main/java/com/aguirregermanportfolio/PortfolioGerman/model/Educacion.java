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
public class Educacion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloEstudios;
    private String casaEstudios;
    private String inicio;
    private String termino;
    private String urlLogo;

    public Educacion() {
    }

    public Educacion(Long id, String tituloEstudios, String casaEstudios, String fechaInicio, String fechaTermino, String urlLogo) {
        this.id = id;
        this.tituloEstudios = tituloEstudios;
        this.casaEstudios = casaEstudios;
        this.inicio = fechaInicio;
        this.termino = fechaTermino;
        this.urlLogo = urlLogo;
    }

}
