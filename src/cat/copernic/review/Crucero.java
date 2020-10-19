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
public class Crucero extends BarcoDePasajeros {
    
    private double lujo;

    public Crucero(double lujo, Motor motor, double eslora, double manga, int nudos, int peso, int camarotes, int pasajeros) {
        super(camarotes, pasajeros, motor, eslora, manga, nudos, peso);
        this.lujo = lujo;
    }
    
}
