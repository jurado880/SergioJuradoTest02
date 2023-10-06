/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Sergio Jurado
 */
public class Alquiler {
    
    private String nombre;
    private String identificacion;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private int idBarco;
    private int nroDiasAlquiler;
    private Double valorAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombre, String identificacion, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, int idBarco, int nroDiasAlquiler, Double valorAlquiler) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.idBarco = idBarco;
        this.nroDiasAlquiler = nroDiasAlquiler;
        this.valorAlquiler = valorAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public int getNroDiasAlquiler() {
        return nroDiasAlquiler;
    }

    public void setNroDiasAlquiler(int nroDiasAlquiler) {
        this.nroDiasAlquiler = nroDiasAlquiler;
    }

    public Double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(Double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }
    
        
    
}
