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
public class Restaurante implements IManejador{
    
    private IManejador sucesor;
    
    public void peticion(String descrepcion, int tiempoDeEspera){
       
        Mesero mesero = new Mescero();
        setSucesor(mesero);
        
        Chef chef = new Chef();
        mesero.setSucesor(chef);
        
        Administrador admin = new Administrador();
        chef.setSucesor(admin);
        
        sucesor.peticion(descrepcion, tiempoDeEspera);
    }
    public IManejador getSucesor(){
        return sucesor;
        
    }
    public void setSucesor(IManejador sucesor){
        this.sucesor = sucesor;
    }
    
    
}
