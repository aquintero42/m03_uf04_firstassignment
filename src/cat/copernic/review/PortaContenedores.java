/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author Adrian
 * 
 * Los portacontenedores son los barcos de mercancias encargados de transportar carga en contenedores estandarizados
 * Utilizaremos una variable tipo int para conocer el número de contenedores que transportaremos
 * 
 */
public class PortaContenedores extends BarcoDeMercancias {
    
    private int numContenedores;
    
    public PortaContenedores(int numContenedores, Motor motor, double eslora, double manga, int nudos, int peso, String descripcionMercancia) {
        super(motor, eslora, manga, nudos, peso, descripcionMercancia);
        this.numContenedores = numContenedores;
        this.nombre = "PortaContenedores";
    }
    
}
