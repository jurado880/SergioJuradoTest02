/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Sergio Jurado
 */
public class Barco {
    
    protected String matricula;
    protected Double eslora;
    protected int anoFabricacion;
    protected Double modulo;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, int anoFabricacion, Double modulo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.modulo = modulo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Double getModulo() {
        return modulo;
    }

    public void setModulo(Double modulo) {
        this.modulo = modulo;
    }

    public void crearBarco() {
    }

    
    
}
