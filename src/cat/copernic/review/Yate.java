/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author Adrian
 */
public class Yate extends BarcoDePasajeros {
 
    private boolean helipuerto;

    public Yate(boolean helipuerto, int camarotes, int pasajeros, Motor motor, double eslora, double manga, int nudos, int peso) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.helipuerto = helipuerto;
        this.nombre = "Mi yate";
    }
    
    
    
    
}
