/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author MULTICOMP
 */
public class Chef implements IManejador{
    private IManejador sucesor;
    
     public void peticion(String descrepcion, int tiempoDeEspera){
        if (tiempoDeEspera<=20  && tiempoDeEspera <= 40){
            JOptionPane.showMessageDialog(null, "La peticion "+descripcion" esta siendo atentido por el chef");
        }else{
            sucesor.peticion(descripcion,tiempoDeEspera);
        }
    }
    public IManejador getSucesor(){
        return sucesor;
        
    }
    public void setSucesor(IManejador sucesor){
        this.sucesor = sucesor;
    }
}
