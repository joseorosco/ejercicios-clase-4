/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MULTICOMP
 */
public class IManejador {
    public void peticion(String descrepcion, int tiempoDeEspera);
    public IManejadorgetSucesor();
    public void setSucesor(IManejador sucesor);
    
}
