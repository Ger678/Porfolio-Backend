/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model;

import java.io.Serializable;
import java.util.Date;
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
@Entity
@Getter
@Setter
public class ExperienciaLaboral implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String nombreEmpresa;
    private String fechaInicio;
    private String fechaFinal;
    private String descripcion;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String puesto, String nombreEmpresa, String fechaInicio, String fechaFinal, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ExperienciaLaboral{" + "id=" + id + ", puesto=" + puesto + ", nombreEmpresa=" + nombreEmpresa + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", descripcion=" + descripcion + '}';
    }
    
    
}
