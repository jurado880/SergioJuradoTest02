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
public class Velero extends Barco {
    
    private int nroMastiles;
    private Double moduloEsp;

    public Velero() {
    }

    public Velero(int nroMastiles, Double moduloEsp, String matricula, Double eslora, int anoFabricacion, Double modulo) {
        super(matricula, eslora, anoFabricacion, modulo);
        this.nroMastiles = nroMastiles;
        this.moduloEsp = moduloEsp;
    }
/*
    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Double getModuloEsp() {
        return moduloEsp;
    }

    public void setModuloEsp(Double moduloEsp) {
        this.moduloEsp = moduloEsp;
    }
*/    
    @Override
    public void crearBarco() {
        
        
        
    }    
    
}
